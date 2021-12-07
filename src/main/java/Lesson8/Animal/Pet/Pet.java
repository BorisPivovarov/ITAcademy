package Lesson8.Animal.Pet;

import Lesson8.Animal.AnimalsSpecification;

abstract class Pet extends AnimalsSpecification {
    protected Pet(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal);
    }

    protected static final String PET = "домашнее";
}
