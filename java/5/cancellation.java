public class cancellation {
	public static void main(String[] args) {
		double sum = 0;
		double n = 50000;
		for (double i = 1; i <= n; i++) {
			sum += (1 / i);
		}
		System.out.println(sum);

		sum = 0;
		for (double i = n; i >= 1; i--) {
			sum += (1 / i);
		}
		System.out.println(sum);
	}
}
