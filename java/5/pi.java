public class pi {
	public static void main(String[] args) {
		for (double i = 10 * 1000; i <= 100 * 1000; i += 10 * 1000) {
			double PI = 0;
			for (double j = i; j >= 1; j--) {
				PI += Math.pow(-1, j + 1) / (2 * j - 1);
			}
			PI *= 4;
			System.out.println(i + " : " + PI);
		}
	}
}
