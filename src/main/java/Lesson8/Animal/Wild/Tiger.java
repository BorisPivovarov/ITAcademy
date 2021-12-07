package Lesson8.Animal.Wild;

public class Tiger extends Wild {
    private static final String CATEGORY = "Тигр";

    public Tiger(String nickName, String voiceOfAnimal) {
        super(nickName, voiceOfAnimal);
    }

    @Override
    public void voice() {
        System.out.println(CATEGORY + " " + this.nickName + " " + WILD +
                " животное, рычит: " + this.voiceOfAnimal);
    }
}