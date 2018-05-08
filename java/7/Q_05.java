import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            nums.add(in.nextInt());
        }
        System.out.println(nums);
    }
}