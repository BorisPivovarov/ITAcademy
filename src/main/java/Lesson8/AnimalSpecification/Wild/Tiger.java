package Lesson8.AnimalSpecification.Wild;

public class Tiger extends Wild {
    private static final String CATEGORY = "Тигр";

    public Tiger(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal, WILD);
    }

    @Override
    public void voice() {
        System.out.println(CATEGORY + " " + this.nickName + " " + WILD +
                " животное, рычит: " + this.voiceOfAnimal);
    }
}