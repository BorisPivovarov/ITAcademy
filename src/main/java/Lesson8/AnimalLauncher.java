package Lesson8;

import Lesson8.Animal.AnimalsSpecification;
import Lesson8.Animal.Pet.Cat;
import Lesson8.Animal.Pet.Dog;
import Lesson8.Animal.Wild.Tiger;

public class AnimalLauncher {
    public static void main(String[] args) {
        Dog biba = new Dog("Биба", "Гав гав");
        Dog boba = new Dog("Боба", "Вуф, вуф");
        Cat kisa = new Cat("Киса", "Мяу мяу");
        Tiger tigra = new Tiger("Тигра", "Рррр!");

        AnimalsSpecification[] animalsSpecifications = new AnimalsSpecification[]{biba, boba, kisa, tigra};
        for (AnimalsSpecification animalsSpecification : animalsSpecifications) {
            animalsSpecification.voice();
        }
    }
}