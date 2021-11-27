package Lesson7;

public class Whale {
    String name;
    int run;
    int swim;

    public Whale (String name, int run, int swim) {
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
        if (run > 0) {
            run = 0;
        }
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        if (swim > 2000) {
            swim = 2000;
        }
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
