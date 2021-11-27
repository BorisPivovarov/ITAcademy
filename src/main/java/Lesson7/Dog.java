package Lesson7;

public class Dog {
    String name;
    int run;
    int swim;

    public Dog (String name, int run, int swim) {
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
        if (swim > 10) {
            swim = 10;
        }
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
