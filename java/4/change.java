import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an amount in double: ");

		String s = in.nextLine();

		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;

		int point = s.indexOf('.');
		String s1 = s.substring(0, point);
		String s2 = s.substring(point + 1);

		for (int i = 0; i < s1.length(); i++) {
			dollars = s1.charAt(i) - '0' + dollars * 10;
		}

		int temp = 0;
		for (int i = 0; i < s2.length(); i++) {
			temp = s2.charAt(i) - '0' + temp * 10;
		}

		quarters = temp / 25;
		dimes = (temp - quarters * 25) / 10;

		temp = (temp - quarters * 25) % 10;
		nickles = temp / 5;
		pennies = temp - nickles * 5;

		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickles + " nickles");
		System.out.println(pennies + " pennies");
	}
}
