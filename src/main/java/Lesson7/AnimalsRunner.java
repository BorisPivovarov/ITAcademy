package Lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat palych = new Cat("Палыч", 200, 0);
        Dog ball = new Dog("Шарик", 500,10);
        Tiger tigra = new Tiger("Тигра", 1000, 500);
        Whale whale = new Whale("Торпеда", 0, 2000);

        palych.setRun(159);
        tigra.setSwim(99);
        ball.setSwim(300);

        System.out.println(palych.name + message1() + palych.getRun() +
                message2() + palych.getSwim());
        System.out.println(ball.name + message1() + ball.getRun() +
                message2() + ball.getSwim());
        System.out.println(tigra.name + message1() + tigra.getRun() +
                message2() + tigra.getSwim());
        System.out.println(whale.name + message1() + whale.getRun() +
                message2() + whale.getSwim());
    }

    private static String message2() {
        return " метров пробежать и проплыть ";
    }

    private static String message1() {
        return " может ";
    }
}
