package Lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat palych = new Cat("Палыч", 200, 0);
        Dog ball = new Dog("Шарик", 500, 10);
        Tiger tigra = new Tiger("Тигра", 1000, 500);
        Whale whale = new Whale("Торпеда", 0, 2000);

        palych.run(200);
        palych.swim(100);
    }
}
