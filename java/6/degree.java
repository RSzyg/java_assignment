public class degree {
	public static void main(String[] args) {
		double celsius = 40.0;
		double fahrenheit = 120.0;

		for (; celsius >= 31.0; celsius--, fahrenheit -= 10) {
			System.out.println(String.format("%.2f", celsius) + "     " + String.format("%.2f", celsiusToFahrenheit(celsius)) + "        " + String.format("%.2f", fahrenheit) + "     " + String.format("%.2f", fahrenheitToCelsius(fahrenheit)));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5.0) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9.0) * (fahrenheit - 32);
	}
}
