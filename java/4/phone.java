import java.util.Scanner;

public class phone {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter:");
		String s = input.nextLine();
		char letter = s.charAt(0);

		int num = 0;
		if (letter >= 'a' && letter <= 'z') {
			num = (letter - 'a') / 3 + 2;
		}
		else if (letter >= 'A' && letter <= 'Z') {
			num = (letter - 'A') / 3 + 2;
		}
		else {
			System.out.println(letter + " is an invalid input");
			return;
		}

		System.out.println(num);
	}
}
