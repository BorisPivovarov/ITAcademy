import java.util.Scanner;

public class Lesson3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, факториал которого надо вычислить:");
        int n = scanner.nextInt();
        int i;
        long result = 1;
        for (i = 1; i <= n; i++) {
        result = i * result;
        }
        System.out.println(n + "!" + " = " + result);
    }
}
