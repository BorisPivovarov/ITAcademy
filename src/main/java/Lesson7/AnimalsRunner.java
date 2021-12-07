package Lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat palych = new Cat("Палыч");
        Tiger tigra = new Tiger("Тигра");
        Whale whale = new Whale("Торпеда");
        Dog bobik = new Dog("Бобик");

        tigra.run(459);
        tigra.swim(50);
        bobik.swim(30);
        bobik.run(300);
        palych.swim(1);
        palych.run(15);
        whale.run(20);
        whale.swim(2_000);
    }
}
