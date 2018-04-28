import java.util.Scanner;

public class prefix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String s1 = in.nextLine();

		System.out.print("Enter the second string: ");
		String s2 = in.nextLine();

		int i = 0;
		String s = "";
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				s += s1.charAt(i);
			}
			else break;
			i++;
		}

		System.out.println("Common prefix: " + s);
	}
}
