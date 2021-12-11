package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class HufToRub implements Changeable {
    public static final double COEFFICIENT = 0.2274;

    @Override
    public double convert(CurrencyValue value) {
        return value.getValue() * COEFFICIENT;
    }
}
