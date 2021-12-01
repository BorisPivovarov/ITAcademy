package Lesson7;

public class Dog extends Animal {
    public Dog(String category, String name, int run, int swim) {
        super(category, name, run, swim);
    }

    public void run(int distance) {
        if (distance <= getRun()) {
            System.out.println(getCategoryName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getCategoryName() + " не может пробежать эту дистанцию");
        }
    }

    public void swim(int distance) {
        if (distance <= getSwim()) {
            System.out.println(getCategoryName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getCategoryName() + " не может проплыть эту дистанцию");
        }
    }
}
