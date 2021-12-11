package Lesson10;

import Lesson10.Rate.*;

public interface Changeable {
    double convert(CurrencyValue value);

    static double convert(CurrencyValue value, CurrencyType toSystem) {
        switch (toSystem) {
            case RUBLES -> {
                switch (value.getCurrencyType()) {
                    case RUBLES -> {
                        return new Converter().convert(value);
                    }
                    case EURO -> {
                        return new EurToRub().convert(value);
                    }
                    case FORINTS -> {
                        return new HufToRub().convert(value);
                    }
                }
            }
            case EURO -> {
                switch (value.getCurrencyType()) {
                    case EURO -> {
                        return new Converter().convert(value);
                    }
                    case RUBLES -> {
                        return new RubToEur().convert(value);
                    }
                    case FORINTS -> {
                        return new HufToEur().convert(value);
                    }
                }
            }
            case FORINTS -> {
                switch (value.getCurrencyType()) {
                    case FORINTS -> {
                        return new Converter().convert(value);
                    }
                    case RUBLES -> {
                        return new RubToHuf().convert(value);
                    }
                    case EURO -> {
                        return new EurToHuf().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("Произошла ошибочка");
    }

    static double convert(double value, CurrencyType fromSystem, CurrencyType toSystem) {
        return Changeable.convert(new CurrencyValue(value, fromSystem), toSystem);
    }
}
