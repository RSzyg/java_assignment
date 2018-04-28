public class license {
	public static void main(String[] args) {
		char l1 = (char)(int)(Math.random() * ('Z' - 'A' + 1) + 'A');
		char l2 = (char)(int)(Math.random() * ('Z' - 'A' + 1) + 'A');
		char l3 = (char)(int)(Math.random() * ('Z' - 'A' + 1) + 'A');
		char l4 = (char)(int)(Math.random() * 10 + '0');
		char l5 = (char)(int)(Math.random() * 10 + '0');
		char l6 = (char)(int)(Math.random() * 10 + '0');
		char l7 = (char)(int)(Math.random() * 10 + '0');

		System.out.println("" + l1 + l2 + l3 + l4 + l5 + l6 + l7);
	}
}
