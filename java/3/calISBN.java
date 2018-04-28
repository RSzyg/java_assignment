import java.util.Scanner;

public class calISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits");
        String s = input.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (((int)(s.charAt(i)) - '0') * (i + 1));
        }
        sum %= 11;
        s += (sum == 10) ? "X" : sum;

        System.out.println("The ISBN-10 number is: " + s);

        input.close();
    }
}