package Lesson7;

public class Tiger extends Animal {
    protected Tiger(String name) {
        super(name);
    }

    private final int MAX_RUN = 5_000;
    private final int MAX_SWIM = 100;
    private final String CATEGORY = "Тигр";

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

