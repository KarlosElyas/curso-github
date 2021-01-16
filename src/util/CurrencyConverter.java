package util;

public class CurrencyConverter {
	public static final double IOF = 6;

	public static double reaisValue(double dollarPrice, double value) {
		return value * dollarPrice * (IOF / 100 + 1);
	}
}
