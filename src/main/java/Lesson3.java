import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый коэффициент a квадратного уравнения (a*x^2+b*x+c=0)");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            return;
        }

        System.out.println("Введите второй коэффициент b квадратного уравнения (a*x^2+b*x+c=0)");
        double b = scanner.nextInt();

        System.out.println("Введите третий коэффициент c квадратного уравнения (a*x^2+b*x+c=0)");
        double c = scanner.nextInt();

        double D = (Math.pow(b, 2)) - (4 * a * c);
        //возведение в степень надо делать через Math.pow или проще через b*b? как правильнее?

        if (D < 0) {
            System.out.println("Уравнение не имеет действительных корней!");
        } else if (D > 0) {

            double x1 = (-b + (Math.sqrt(D))) / (2 * a);
            double x2 = (-b - (Math.sqrt(D))) / (2 * a);
            System.out.println("Поздравляем, у нас будет два корня: " + x1 + " и " + x2);
        } else if (D == 0) {
            double x = (-b + (Math.sqrt(D))) / (2 * a);
            System.out.println("Улов не большой, но есть один корень: " + x);
        }
    }
}
