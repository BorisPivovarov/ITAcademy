import java.security.MessageDigest;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getN(scanner);
        int result = getResult(n);
        System.out.println(n + "-й член последовательности будет иметь значение: " + result);
    }

    private static int getN(Scanner scanner) {
        int x;
        do {
            String Message = "Введите не отрицательный n-й член последовательности Фибоначчи ";
            System.out.println(Message);
            while (!scanner.hasNextInt()) {
                System.out.println("Тут что-то не то! Введите число:");
                scanner.next();
            }
            x = scanner.nextInt();
        } while (x < 0);
        System.out.println("Спасибо, начинаем обработку вашего числа " + x);
        return x;
    }

    private static int getResult(int n) {
        int i = 0; //счетчик
        int j = 1;
        int result = 0;
        while (n != i) {
            for (i = 0; i != n; i++) {
                result = result + j;
                j = result - j;
            }
        }
        return result;
    }
}
