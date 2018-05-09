import java.util.*;

public class Q_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                if (m[j][i] < 0) return false;
                sum += m[j][i];
            }
            if (sum != 1.0) return false;
        }
        return true;
    }
}