package Lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat catPalych = new Cat("Кот", "Палыч", 200, 0);
        Tiger tigra = new Tiger("Тигр", "Тигра", 1_000, 500);
        Whale whale = new Whale("Кит", "Торпеда", 0, 2_000);
        Dog bobik = new Dog("Пёс", "Бобик", 200, 10);

        tigra.run(459);
        tigra.swim(50);
        bobik.swim(30);
        bobik.run(300);
        catPalych.swim(1);
        catPalych.run(15);
        whale.run(20);
        whale.swim(2_001);
    }
}
