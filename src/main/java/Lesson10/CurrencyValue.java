package Lesson10;

public record CurrencyValue(double value, CurrencyType currencyType) {

    public double getValue() {
        return value;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
