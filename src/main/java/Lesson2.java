import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Введите значение первой переменной");

        double a = sc.nextDouble();

        System.out.println("Введите значение второй переменной");

        double b = sc.nextDouble();

        BigDecimal sum1 = new BigDecimal(a);
        BigDecimal sum2 = new BigDecimal(b);
        BigDecimal sum3 = sum1.add(sum2);
        String sum = String.format("%.3f", sum3);

        BigDecimal subA = new BigDecimal(a);
        BigDecimal subB = new BigDecimal(b);
        BigDecimal subC = subA.subtract(subB);
        BigDecimal subV = subB.subtract(subA);
        String subN = String.format("%.3f", subV);
        String sub = String.format("%.3f", subC);

        double mult = a * b;
        String multi = String.format("%.3f", mult);

        double res = a / b;
        String result = String.format("%.3f", res);


        System.out.println("Сумма чисел " + (a) + " и " + (b) + " = " + (sum) + "\n" +
                "Разность чисел " + (a) + " и " + (b) + " = " + (sub) + "\n" +
                "Произведение чисел " + (a) + " и " + (b) + " = " + (multi) + "\n" +
                "Деление чисел " + (a) + " и " + (b) + " = " + (result));


        if (a > b) {
            System.out.println("Число " + (a) + " больше числа " + (b) + " на " + (sub));
        } else if (a < b) {
            System.out.println("Число " + (a) + " меньше числа " + (b) + " на " + (subN)); //как сделать это через Math.abs(sub)???
        } else if (a == b) {
            System.out.println("Число " + (a) + " равно числу " + (b));
        }

    }
}