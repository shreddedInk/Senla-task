package converter;

public class Converter {

    // Курсы валют относительно USD
    private static final double EUR_RATE = 0.85;
    private static final double GBP_RATE = 0.75;
    private static final double RUB_RATE = 75.0;
    private static final double JPY_RATE = 110.0;
    private static final double CNY_RATE = 6.4;

    public static double toEuro(double amount) {
        return amount * EUR_RATE;
    }

    public static double toPound(double amount) {
        return amount * GBP_RATE;
    }

    public static double toRuble(double amount) {
        return amount * RUB_RATE;
    }

    public static double toYen(double amount) {
        return amount * JPY_RATE;
    }

    public static double toYuan(double amount) {
        return amount * CNY_RATE;
    }
}
