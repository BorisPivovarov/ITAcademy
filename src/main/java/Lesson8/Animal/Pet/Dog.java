package Lesson8.Animal.Pet;

public class Dog extends Pet {
    private static final String CATEGORY = "Собака";

    public Dog(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal);
    }

    @Override
    public void voice() {
        System.out.println(CATEGORY + " " + this.nickName + " " + PET +
                " животное, лает: " + this.voiceOfAnimal);
    }
}
