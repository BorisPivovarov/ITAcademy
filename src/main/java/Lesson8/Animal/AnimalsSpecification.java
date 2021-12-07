package Lesson8.Animal;

public abstract class AnimalsSpecification {

    protected String nickName;
    protected String voiceOfAnimal;

    public abstract void voice();

    protected AnimalsSpecification(String nickName, String voiceOfAnimal) {
        this.nickName = nickName;
        this.voiceOfAnimal = voiceOfAnimal;
    }
}
