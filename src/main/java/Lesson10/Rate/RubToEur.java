package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class RubToEur implements Changeable {
    public static final double COEFFICIENT = 0.012;

    @Override
    public double convert(CurrencyValue value) {
        return value.getValue() * COEFFICIENT;
    }
}
