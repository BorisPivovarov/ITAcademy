package Lesson7;

public class Whale extends Animal {
    protected Whale(String name) {
        super(name);
    }

    private final String MAX_RUN = " не умеет бегать, отсутствуют лапки";
    private final int MAX_SWIM = 2_000;
    private final String CATEGORY = "Кит";

    public void run(int distance) {
        System.out.println(CATEGORY + " " + name + MAX_RUN);
    }

    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(CATEGORY + " " + name + " проплыл " + distance + " м.");
        } else {
            System.out.println(CATEGORY + " " + name + " не может проплыть эту дистанцию");
        }
    }
}
