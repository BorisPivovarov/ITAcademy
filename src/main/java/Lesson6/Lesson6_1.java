package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = inputProtection(scanner);
        double[] array = getInts(n);
        showArray(array);
        maxValue(n, array);
        minValue(n, array);
        avgValue(n, array);
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
        //System.out.println("Количество элементов массива =  " + x);
        return x;
    }

    private static void avgValue(int n, double[] array) {
        double avg = 0;
        int i;
        for (i = 0; i < n; i++) {
            avg = avg + array[i];
        }
        avg = avg / n;
        System.out.println("Среднее значение: " + avg);
    }

    private static void minValue(int n, double[] array) {
        double min = array[0];
        int indexForAvg = 0;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
                indexForAvg = i;
            }
        }
        System.out.println("Миниимальное значение: " + min + ", его индекс " + indexForAvg);
    }

    private static void maxValue(int n, double[] array) {
        double max = array[0];
        int i;
        int indexForMax = 0;
        for (i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
                indexForMax = i;
            }
        }
        System.out.println("Максимальное значение: " + max + ", его индекс " + indexForMax);
    }

    private static double[] getInts(int n) {
        double[] array = new double[n];
        for (int x = 0; x < n; x++) {
            array[x] = Math.random();
        }
        return array;
    }

    private static void showArray(double[] array) {
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);
    }
}