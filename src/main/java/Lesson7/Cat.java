package Lesson7;

public class Cat extends Animal {
    public Cat(String category, String name, int run, int swim) {
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
        System.out.println(getCategoryName() + " не умеет плавать");
    }
}

