package Lesson7;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    private final int MAX_RUN = 200;
    private final String MAX_SWIM = " не умеет плавать";
    private final String CATEGORY = "Кот";

    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(CATEGORY + " " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println(CATEGORY + " " + name + " не может пробежать эту дистанцию");
        }
    }

    public void swim(int distance) {
        System.out.println(CATEGORY + " " + name + MAX_SWIM);
    }
}

