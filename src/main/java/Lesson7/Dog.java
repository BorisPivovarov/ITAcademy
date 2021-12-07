package Lesson7;

public class Dog extends Animal {
    protected Dog(String name) {
        super(name);
    }

    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    private final String CATEGORY = "Пёс";

    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(CATEGORY + " " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println(CATEGORY + " " + name + " не может пробежать эту дистанцию");
        }
    }

    public void swim(int distance) {

        if (distance <= MAX_SWIM) {
            System.out.println(CATEGORY + " " + name + " проплыл " + distance + " м.");
        } else {
            System.out.println(CATEGORY + " " + name + " не может проплыть эту дистанцию");
        }
    }
}