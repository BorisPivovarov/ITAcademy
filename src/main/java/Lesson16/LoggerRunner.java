package Lesson16;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoggerRunner {

    private static final String FILE_NAME = "D:\\test\\test.txt";
    private static final String FILE_DIR = "D:\\test";

    public static void main(String[] args) throws Exception {

        File dir = makeDir();
        makeFile(dir);

        List<Thread> threads = IntStream.range(0, 3).boxed().map(i -> {
            final LoggerOptions[] loggerOptions = LoggerOptions.values();
            Logger logger = new Logger(loggerOptions[new Random().nextInt(loggerOptions.length)], FILE_NAME);
            return new Thread(logger);
        }).peek(Thread::start).collect(Collectors.toList());
        for (Thread thread : threads) {
            try (FileReader fileReader = new FileReader(FILE_NAME)) {
                IOUtils.copy(fileReader, (OutputStream) System.out);
            }
        }
    }

    private static void makeFile(File dir) {
        File newFile = new File(FILE_NAME);
        try {
            boolean exists = newFile.exists();
            if (exists) {
                System.out.println("Файл существует, мы его удаляем и делаем новый: " + dir);
                newFile.delete();
            } else {
                System.out.println("Создаем новый файл: " + FILE_NAME);
            }
            newFile.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static File makeDir() {
        File dir = new File(FILE_DIR);
        boolean dirIsCreated = dir.exists();
        if (dirIsCreated) {
            System.out.println("Директория существует: " + dir);
        } else {
            System.out.println("Создаём директорию: " + dir);
            dir.mkdir();
        }
        return dir;
    }
}
