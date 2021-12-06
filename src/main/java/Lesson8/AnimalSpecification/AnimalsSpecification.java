package Lesson8.AnimalSpecification;

public abstract class AnimalsSpecification {

    protected String nickName;
    protected String voiceOfAnimal;

    public abstract void voice();

    public AnimalsSpecification(String nickName, String voiceOfAnimal) {
        this.nickName = nickName;
        this.voiceOfAnimal = voiceOfAnimal;
    }
}
