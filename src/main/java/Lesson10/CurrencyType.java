package Lesson10;

public enum CurrencyType {
    RUBLES("RUB"), EURO("EUR"), FORINTS("HUF");

    private final String shortName;

    CurrencyType(String shortName) {
        this.shortName = shortName;
    }

    public static CurrencyType of(String input) {
        for (CurrencyType currencyType : values()) {
            if (currencyType.shortName.equalsIgnoreCase(input)) {
                return currencyType;
            }
        }
        return RUBLES;
    }
}

