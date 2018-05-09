import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for (int i = 2; i >= 0; i--) {
            for (int j = 3; j >= 1; j--) {
                if (((num >> (i * 3 + j - 1)) & 1) == 0) {
                    System.out.print("H");
                }
                else System.out.print("T");
            }
            System.out.println();
        }
    }
}