package Lesson9.OnlineLesson9.implementation;

import Lesson9.OnlineLesson9.Account;
import static Lesson9.OnlineLesson9.Course.CURRENT_VALUE;
public class CompanyAccount extends Account {

    public static int COUNT = 0;

//    private static final double COURSE = 75.56; // 1$ = 75.56рублей

    public CompanyAccount(String name) {
        super(name);
        COUNT++;
    }

    public double getBalanceInDollars() {
        if (isBlocked()) {
            return 0;
        }
        return this.getBalance() / CURRENT_VALUE;
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс в долларах: " + getBalanceInDollars());
    }
}
