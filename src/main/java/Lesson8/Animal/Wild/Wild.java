package Lesson8.Animal.Wild;

import Lesson8.Animal.AnimalsSpecification;

abstract class Wild extends AnimalsSpecification {
    protected Wild(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal);
    }

    protected static final String WILD = "дикое";
}