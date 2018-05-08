import java.util.*;

public class Q_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] panel = new int[100];
        int balls = in.nextInt();
        int slots = in.nextInt();

        for (int i = 0; i < balls; i++) {
            int pos = 0;
            for (int j = 1; j < slots; j++) {
                boolean left = Math.random() < 0.5;
                if (left) System.out.print("L");
                else {
                    pos++;
                    System.out.print("R");
                }
            }
            panel[pos]++;
            System.out.println();
        }

        for (int i = balls - 1; i >= 0; i--) {
            for (int j = 0; j < slots; j++) {
                if (panel[j] > i) {
                    System.out.print("0");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}