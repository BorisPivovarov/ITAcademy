package Lesson9.Automobile;

import Lesson9.Automobile.Car.Car;
import Lesson9.Automobile.Truck.Truck;

public class AutomobileRunner {
    public static void main(String[] args) {

        Truck ural = new Truck("Ural");
        Truck gaz = new Truck("Gaz");
        Truck uaz = new Truck("UAZ");
        Truck kamaz = new Truck("Kamaz");
        Truck belaz = new Truck("Belaz");
        Car mazda = new Car("Mazda");
        Car toyota = new Car("Toyota");
        Car opel = new Car("Opel");
        Car skoda = new Car("Skoda");
        Car lada = new Car("Lada");

        Automobile[] automobiles = new Automobile[]{ural, gaz, uaz, kamaz, belaz, mazda, toyota, opel, skoda, lada};
        for (Automobile automobile : automobiles) {
            automobile.move();
        }
    }
}
