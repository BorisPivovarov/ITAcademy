package Lesson7;

public class Tiger {
    String name;
    int run;
    int swim;

    public Tiger (String name, int run, int swim) {
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
        if (run > 2000) {
            run = 2000;
        }
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        if (swim > 459) {
            swim = 459;
        }
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
