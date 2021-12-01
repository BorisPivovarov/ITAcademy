package Lesson7;

public class Animal {
    private String category;
    private String name;
    private int run;
    private int swim;

    public Animal(String category, String name, int run, int swim) {
        this.category = category;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public String getCategoryName() {
        return category + " " + name;
    }
}
