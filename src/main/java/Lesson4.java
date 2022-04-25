import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textMessage1 = "Введите желаемое число для нахождения его корня";
        String textMessage3 = "Квадратный корень числа ";
        String textMessage4 = " равен ";
        String textMessage5 = "Введено некоректное число";

        System.out.println(textMessage1);
        sqrtMethod(scanner, textMessage3, textMessage4, textMessage5);
    }

    public static void sqrtMethod(Scanner scanner, String textMessage3, String textMessage4, String textMessage5) {
        int x5 = scanner.nextInt();
        int i5;
        for (i5 = x5; i5 >= 0; i5--) {
            if (x5 == i5 * i5) {
                System.out.println(textMessage3 + x5 + textMessage4 + i5);
                return;
            }
        }
        if (x5 != i5 * i5) {
            System.out.println(textMessage5);
        }
    }
}