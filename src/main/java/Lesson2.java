import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        String Message1 = "Введите значение переменной ";

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println(Message1 + 1);
        double a = sc.nextDouble();

        System.out.println(Message1 + 2);
        double b = sc.nextDouble();
        String Message2 = "Сумма ";
        String Message4 = "Разность ";
        String Message5 = "Произведение ";
        String Message6 = "Деление ";
        String Message3 = "чисел " + (a) + " и " + (b) + " = ";


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

        System.out.println(Message2 + Message3 + (sum) + "\n" +
                Message4 + Message3 + (sub) + "\n" +
                Message5 + Message3 + (multi) + "\n" +
                Message6 + Message3 + (result));

        if (a > b) {
            System.out.println((a) + " больше числа " + (b) + " на " + (sub));
        } else if (a < b) {
            System.out.println((a) + " меньше числа " + (b) + " на " + (subN));
        } else if (a == b) {
            System.out.println((a) + " равно числу " + (b));
        }
    }
}