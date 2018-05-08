import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nums1[] = new double[11];
        int nums2[] = new int[11];
        for (int i = 0; i < 10; i++) {
            nums1[i] = in.nextDouble();
            nums2[i] = (int)nums1[i];
        }
        System.out.println(average(nums1));
        System.out.println(average(nums2));
    }
    public static int average(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += nums[i];
        }
        return sum / 10;
    }
    public static double average(double[] nums) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += nums[i];
        }
        return (sum / 10.0);
    }
}