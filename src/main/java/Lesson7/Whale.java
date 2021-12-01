package Lesson7;

public class Whale extends Animal {
    public Whale(String category, String name, int run, int swim) {
        super(category, name, run, swim);
    }

    public void run(int distance) {
        System.out.println(getCategoryName() + " не сможет пробежать эту дистанцию, отсутствуют лапки");
    }

    public void swim(int distance) {
        if (distance <= getSwim()) {
            System.out.println(getCategoryName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getCategoryName() + " просто устал и проплывёт позже");
        }
    }
}
