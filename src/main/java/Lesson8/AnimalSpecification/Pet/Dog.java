package Lesson8.AnimalSpecification.Pet;

public class Dog extends Pet {
    private static final String CATEGORY = "Собака";

    public Dog(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal, PET);
    }

    @Override
    public void voice() {
        System.out.println(CATEGORY + " " + this.nickName + " " + PET +
                " животное, лает: " + this.voiceOfAnimal);
    }
}
