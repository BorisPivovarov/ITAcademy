package Lesson16;


import lombok.RequiredArgsConstructor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@RequiredArgsConstructor
public class Logger implements Runnable {


    private final LoggerOptions options;
    private final String fileName;
    private final long currentTimeMilis = System.currentTimeMillis();

    private static final String FORMAT_TEXT = "%s %s %s %s\n";
    private static final DateTimeFormatter FULL_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final int LIFE_TIME = 60 * 1000;
    private int counter = 1;


    @Override
    public void run() {
        System.out.printf("Начал работу поток %s\n", Thread.currentThread().getName());
        while (System.currentTimeMillis() <= currentTimeMilis + LIFE_TIME) {
            try (FileWriter file = new FileWriter(fileName, true)) {
                file.write(lineToFile());
                Thread.sleep(new Random().nextInt(5_000));
            } catch (IOException | InterruptedException ioE) {
                ioE.printStackTrace();
                break;
            }
        }
    }

    private String lineToFile() {
        LocalDateTime now = LocalDateTime.now();
        return String.format(FORMAT_TEXT, FULL_DATE_TIME_FORMAT.format(now),
                options, Thread.currentThread().getName(), "Это сообщение записано под #" + counter++);
    }
}
