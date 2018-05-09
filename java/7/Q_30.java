import java.util.*;

public class Q_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] values = new int[100];

        for (int i = 0; i < length; i++) {
            values[i] = in.nextInt();
        }

        if (isConsecutiveFour(values, length)) System.out.println("The list has consecutive fours");
        else System.out.println("The list has not consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values, int length) {
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (count == 4) return true;
            if (values[i] == values[i - 1]) count++;
            else count = 1;
        }
        return false;
    }
}