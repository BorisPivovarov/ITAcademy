package Lesson9.Automobile;

public abstract class Automobile {
    protected String carName;
    protected int distance;

    public abstract void move(int distance);

    protected Automobile(String carName) {
        this.carName = carName;
        this.distance = (int) (Math.random() * 1000);
    }
}
