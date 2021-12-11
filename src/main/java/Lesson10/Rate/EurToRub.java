package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class EurToRub implements Changeable {
    public static final double COEFFICIENT = 83.12;

    @Override
    public double convert(CurrencyValue value) {
        return value.getValue() * COEFFICIENT;
    }
}
