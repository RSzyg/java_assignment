import java.util.Scanner;

public class calDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] s = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("Enter year: (e.g., 2012):");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12:");
        int m = input.nextInt();
        if (m == 1) {
            year--;
            m = 13;
        }
        else if (m == 2) {
            year--;
            m = 14;
        }

        int j = year/100;
        int k = year%100;

        System.out.println("Enter the day of the month: 1-31:");
        int q = input.nextInt();

        int h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j)%7;
        System.out.println("Day of the week is: " + s[h]);

        input.close();
    }
}