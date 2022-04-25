import java.util.Scanner;

public class lesson5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int limit = scanner.nextInt();
        printPrimeNumbers(limit);

    }

    public static void printPrimeNumbers(int treshold) {
        if (treshold <= 1) {
            System.out.println("ожидается ввод > 1");
        }

        for (int i = 2; i < treshold; i++) {
            if (isPrime(i)) {
                System.out.println("Простое " + i);
            }
        }
    }
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
