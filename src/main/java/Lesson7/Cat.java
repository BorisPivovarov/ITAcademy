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
        if (run > 200) {
            run = 200;
        }
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        if (swim > 0) {
            swim = 0;
        }
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

}
