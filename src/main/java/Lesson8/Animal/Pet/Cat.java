package Lesson8.Animal.Pet;

public class Cat extends Pet {
    private static final String CATEGORY = "Кошка";

    public Cat(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal);
    }

    @Override
    public void voice() {
        System.out.println(CATEGORY + " " + this.nickName + " " + PET +
                " животное, мяукает: " + this.voiceOfAnimal);
    }
}