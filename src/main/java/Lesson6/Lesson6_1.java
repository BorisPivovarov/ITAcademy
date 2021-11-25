package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = inputProtection(scanner);
        double[] array = getDoubles(n);
        showArray(array);
        System.out.println("Максимальное значение " + maxValue(n, array) +
                ", его индекс " + indexMax(n, array));
        System.out.println("Минимальное значение " + minValue(n, array) +
                ", его индекс " + indexMin(n, array));
        System.out.println("Среднее значение: " + avgValue(n, array));
    }

    private static int inputProtection(Scanner scanner) {
        int x;
        do {
            String Message = "Введите положительное целое число больше 0 для установления длинны массива";
            System.out.println(Message);
            while (!scanner.hasNextInt()) {
                System.out.println("Тут что-то не то! Введите число:");
                scanner.next();
            }
            x = scanner.nextInt();
        } while (x <= 0);
        return x;
    }

    private static double avgValue(int n, double[] array) {
        double avg = 0;
        int i;
        for (i = 0; i < n; i++) {
            avg = avg + array[i];
        }
        avg = avg / n;
        return avg;
    }

    private static double minValue(int n, double[] array) {
        double min = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static double maxValue(int n, double[] array) {
        double max = array[0];
        int i;
        for (i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private static double[] getDoubles(int n) {
        double[] array = new double[n];
        for (int x = 0; x < n; x++) {
            array[x] = Math.random();
        }
        return array;
    }

    private static int indexMax(int n, double[] array) {
        double max = array[0];
        int i;
        int indexMax = 0;
        for (i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    private static int indexMin(int n, double[] array) {
        double min = array[0];
        int i;
        int indexMin = 0;
        for (i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    private static void showArray(double[] array) {
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);
    }
}