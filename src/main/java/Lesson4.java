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

 /*
        String textMessage5 = "Не так сразу, мне нужно время,чтобы привыкнуть к Вашим параметрам";
        String textMessage6 = "Вычисляю :";
        String textMessage2 = "Оппа! Вводимое число должно быть положительным!" + "\n" +
                "Программа обиделась и сворачивается";
      //1й способ
        int x = scanner.nextInt();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(textMessage5);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(textMessage6);
        TimeUnit.SECONDS.sleep(1);
        int i = 0;
        if (x < 0) {
            System.out.println(textMessage2);
            return;
        } else {
            while (x != i * i) {
                i++;
            }
            if (i >= x) {
                System.out.println("error");
            }
        }
        System.out.println(textMessage3 + x + textMessage4 + i);


    /*
            //2й способ
            int x3 = scanner.nextInt(); //вводимое число
            int i3; // счетчик и корень числа
            if (x3 == 0) {
                System.out.println(0);
            } else {
                for (i3 = 1; i3 <= x3; i3++) {
                    if (i3 * i3 == x3) {
                        System.out.println(textMessage3 + x3 + textMessage4 + i3);
                        break;
                    }
                }
            }

            //3й способ
            int i4 = 0;
            int x4 = scanner.nextInt();
            while (i4 <= x4) {
                if (i4 * i4 == x4) {
                    System.out.println(textMessage3 + x4 + textMessage4 + i4);
                    break;
                } else {
                    i4++;
                }
            }
            // 4й способ

     */
// тоже самое, но через while
        /*while (sqrtX1 != b * b) {
            b--;
        }
        // System.out.println("Квадратный корень числа " + sqrtX1 + " равен " + b);
 */