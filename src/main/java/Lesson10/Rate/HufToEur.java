package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class HufToEur implements Changeable {
    public static final double COEFFICIENT = 0.0027;

    @Override
    public double convert(CurrencyValue value) {
        return value.getValue() * COEFFICIENT;
    }
}
