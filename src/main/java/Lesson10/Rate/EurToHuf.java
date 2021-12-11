package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class EurToHuf implements Changeable {
    public static final double COEFFICIENT = 365.58;

    @Override
    public double convert(CurrencyValue value) {
        return value.getValue() * COEFFICIENT;
    }
}
