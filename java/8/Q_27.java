import java.util.*;

public class Q_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] m = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = in.nextDouble();
            }
        }

        m = sortColumns(m);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortColumns(double[][] m) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3 - i - 1; k++) {
                    if (m[k][j] > m[k + 1][j]) {
                        double t = m[k][j];
                        m[k][j] = m[k + 1][j];
                        m[k + 1][j] = t;
                    }
                }
            }
        }
        return m;
    }
}