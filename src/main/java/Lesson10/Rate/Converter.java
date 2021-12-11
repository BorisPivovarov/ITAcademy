package Lesson10.Rate;

import Lesson10.Changeable;
import Lesson10.CurrencyValue;

public class Converter implements Changeable {
    @Override
    public double convert(CurrencyValue value) {
        return value.getValue();
    }
}
