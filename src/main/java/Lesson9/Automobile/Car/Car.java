package Lesson9.Automobile.Car;
import Lesson9.Automobile.Automobile;

public class Car extends Automobile {

    private static final String TYPE = "Car";
    private static final int MAX_DISTANCE = 500;

    public Car(String carName) {
        super(carName);
    }

    @Override
    public void move() {
        if (distance <= MAX_DISTANCE) {
            System.out.println(this.carName + ", тип автомобиля: " +
                    TYPE + ", проехал дистанцию: " + distance + " км.");
        } else {
            System.out.println(this.carName + ", тип автомобиля: " +
                    TYPE + " не сможет проехать дистанцию: " + distance + " км.");
        }
    }
}
