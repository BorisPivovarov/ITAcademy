package Lesson9.OnlineLesson9.Automobile;

import Lesson9.OnlineLesson9.Automobile.Car.Car;
import Lesson9.OnlineLesson9.Automobile.Truck.Truck;

import java.util.Random;

public class AutomobileRunner {
    public static void main(String[] args) {

        Truck kamaz = new Truck("Kamaz");
        Truck belaz = new Truck("Belaz");
        Car mazda = new Car("Mazda");
        Car toyota = new Car("Toyota");
        Car opel = new Car("Opel");
        Car skoda = new Car("Skoda");
        Car lada = new Car("Lada");

        Automobile[] automobiles = new Automobile[]{kamaz, belaz, mazda, toyota, opel, skoda, lada};
        for (Automobile automobile : automobiles) {
            automobile.move();
        }
    }
}
