package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class RubToHuf implements Changeable {
    public static final double COEFFICIENT = 4.4;
    @Override
    public double convert(CurrencyValue value) {
        return value.getValue()*COEFFICIENT;
    }
}
