package Lesson18;

import lombok.SneakyThrows;
import lombok.val;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class FileParserRunner {

    public static void main(String[] args) {
        val FILE_LOCATION = "/example.txt";
        InputStream resourceAsStream = FileParserRunner.class.getResourceAsStream(FILE_LOCATION);
        if (resourceAsStream == null) {
            return;
        }

        val extension = FilenameUtils.getExtension(FILE_LOCATION);
        val index = new AtomicInteger();
        readAndParse(resourceAsStream, line -> writeToFile(extension, index, line));
    }

    @SneakyThrows(IOException.class)
    public static void readAndParse(InputStream inputStream, Consumer<String> consumer) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            bufferedReader.lines().filter(StringUtils::isNotBlank).forEach(consumer);
        }
    }

    @SneakyThrows
    private static void writeToFile(String filenameUtils, AtomicInteger count, String line) {
        Path path = Paths.get("D:\\test", "File" + count.incrementAndGet() + "." + filenameUtils);
        System.out.printf("Запись файла %s\n", path.getFileName());
        if (!Files.exists(path.getParent())) {
            if (!path.getParent().toFile().mkdirs()) {
                System.out.println("Во время создания папки вышла ошибка");
                return;
            }
        }

        Files.writeString(path, line, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
