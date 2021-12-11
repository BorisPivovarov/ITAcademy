package Lesson10;

import java.util.Scanner;

public class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Введите количество валюты для конвертации");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.printf("Вы ввели: %s, а должно быть вещественное число\n", inputValue);
        }
        double value = scanner.nextDouble();
        System.out.println("Введите пожалуйста исходную валюту (RUB, EUR, HUF):");
        String originalCurrency = scanner.next();
        System.out.println("Введите пожалуйста валюту," +
                " в которую будет переводено указанное ранее значение (RUB, EUR, HUF:");
        String secondCurrency = scanner.next();
        System.out.printf("Результат: %.3f\n", Changeable.convert(value,
                CurrencyType.of(originalCurrency),
                CurrencyType.of(secondCurrency)));
    }
}
