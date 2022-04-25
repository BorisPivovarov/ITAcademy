package Lesson9.OnlineLesson9.implementation;

import Lesson9.OnlineLesson9.Account;
public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

    public static String getBic() {
        return "464315021";
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс: " + getBalance());
    }
}
