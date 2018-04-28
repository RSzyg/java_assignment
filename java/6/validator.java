import java.util.Scanner;

public class validator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String pwd = in.nextLine();

		if (validate(pwd)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}

	public static boolean validate(String pwd) {
		if (pwd.length() < 8) return false;
		int count = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isDigit(pwd.charAt(i))) count++;
			else if (Character.isLetter(pwd.charAt(i))) continue;
			else return false;
		}
		if (count < 2) return false;
		return true;
	}
} 
