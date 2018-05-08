public class meson {
    public static void main(String[] args) {
        for (int i = 2; i <= 31; i++) {
            int a = (1 << (i - 1)) - 1 + (1 << (i - 1));
            if (isMason(a)) {
                System.out.println(i + " " + a);
            }
        }
    }
    public static boolean isMason(int p) {
        for (int i = 2; i * i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}