import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        String Message = "Введите коэффициент ";
        String Message1 = " квадратного уравнения (a*x^2+b*x+c=0)";
        Scanner scanner = new Scanner(System.in);

        System.out.println(Message + "a" + Message1);
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            return;
        }

        System.out.println(Message + "b" + Message1);
        double b = scanner.nextInt();

        System.out.println(Message + "c" + Message1);
        double c = scanner.nextInt();

        double D = (Math.pow(b, 2)) - (4 * a * c);
        //возведение в степень надо делать через Math.pow или проще через b*b? как правильнее?

        if (D < 0) {
            System.out.println("Уравнение не имеет действительных корней!");
        } else {
            double x3 = (-b + (Math.sqrt(D))) / (2 * a);
            if (D > 0) {

                double x1 = x3;
                double x2 = (-b - (Math.sqrt(D))) / (2 * a);
                System.out.println("Поздравляем, у нас будет два корня: " + x1 + " и " + x2);
            } else if (D == 0) {
                double x = x3;
                System.out.println("Улов не большой, но есть один корень: " + x);
            }
        }
    }
}
