import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = in.nextInt();
		String s = "";

		while (num >= 0) {
			s += (char)((num & 1) + '0');
			num = num>>1;
			if (num == 0) break;
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print('\n');
	}
}
