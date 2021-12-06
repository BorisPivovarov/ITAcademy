package Lesson8.AnimalSpecification.Pet;

import Lesson8.AnimalSpecification.AnimalsSpecification;

abstract class Pet extends AnimalsSpecification {
    public Pet(String nickName, String voiceOfAnimal, String PET) {
        super(nickName, voiceOfAnimal);
    }

    protected static final String PET = "домашнее";
}
