package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_2 {

    public static void main(String[] args) {
        int arrayLength = 20;
        Scanner scanner = new Scanner(System.in);
        int a = inputProtection(scanner);

        if (a <= arrayLength - 1) {
            useArray(arrayLength, a);
        } else {
            warning();
            useArray(arrayLength = a + 1, a);
        }
        showThisArray(arrayLength);
    }

    private static void warning() {
        System.out.println("Ой-ёй, у нас массив меньше.. но сейчас мы что-нибудь придумаем!");
    }

    private static void showThisArray(int arrayLength) {
        System.out.println("Массив выглядит так:");
        showArray(makeArray(arrayLength));
    }

    private static void useArray(int arrayLength, int a) {
        int[] arr = makeArray(arrayLength);
        int i;
        int result = 0;

        for (i = 0; i <= a; i++) {
            result = arr[i];
        }
        System.out.println(a + "-й член последовательности будет иметь значение: " + result);
    }

    public static int[] makeArray(int n) {
        int[] array = new int[n];
        int i = 0;
        int result = 0;
        int j = 1;
        while (n != i) {
            for (i = 0; i != n; i++) {
                result = result + j;
                j = result - j;
                array[i] = j;
            }
        }
        return array;
    }

    private static int inputProtection(Scanner scanner) {
        int n;
        do {
            String Message = "Введите не отрицательный n-й член последовательности Фибоначчи";
            System.out.println(Message);
            while (!scanner.hasNextInt()) {
                System.out.println("Тут что-то не то! Введите число:");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 0);
        return n;
    }

    private static void showArray(int[] array) {
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);
    }
}
