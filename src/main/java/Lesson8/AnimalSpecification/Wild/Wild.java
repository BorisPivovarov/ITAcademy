package Lesson8.AnimalSpecification.Wild;

import Lesson8.AnimalSpecification.AnimalsSpecification;

abstract class Wild extends AnimalsSpecification {
    public Wild(String nickName, String voiceOfAnimal, String WILD) {
        super(nickName, voiceOfAnimal);
    }

    protected static final String WILD = "дикое";
}