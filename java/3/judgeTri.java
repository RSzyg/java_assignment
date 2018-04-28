import java.util.Scanner;

public class judgeTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x >= 0 && y >= 0 && (y + x/2) <= 100) {
            System.out.println("Point (" + x + "," + y + ") is in the tritangle");
        }
        else {
            System.out.println("Point (" + x + "," + y + ") is not in the tritangle");
        }

        input.close();
    }
}