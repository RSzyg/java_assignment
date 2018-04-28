import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int num = in.nextInt();

		if (isPalindrome(num)) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int num) {
		int rev = reverse(num);
		if (num == rev) return true;
		else return false;
	}
}
