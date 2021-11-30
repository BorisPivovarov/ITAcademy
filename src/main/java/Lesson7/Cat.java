package Lesson7;

public class Cat {
    String name;
    int run;
    int swim;

    public Cat(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
    public void run(int distance){
        if (distance <= getRun()) {
            System.out.println(getName() + " пробежал " + run + " метров");
        } else {
            System.out.println(getName() + " не сможет пробежать эту дистанцию");
        }
    }
    public void swim(int distance){
        if (distance <= getSwim()) {
            System.out.println(getName() + " проплыл " + swim + " метров");
        } else {
            System.out.println(getName() + " не умеет плавать");
        }
    }
}
