package Lesson9.Automobile.Truck;

import Lesson9.Automobile.Automobile;

public final class Truck extends Automobile {

    private static final String TYPE = "Truck";
    private static final int MAX_DISTANCE = 1200;

    public Truck(String carName) {
        super(carName);
    }

    @Override
    public void move(int distance) {
        if (distance <= MAX_DISTANCE) {
            System.out.println(this.carName + ", тип автомобиля: " +
                    TYPE + ", проехал дистанцию: " + distance + " км.");
        }
    }
}
