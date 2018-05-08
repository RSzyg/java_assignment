public class Dice {
    public static void main(String arg[]) {
        judge(roll(), roll(), 0);
    }
    public static boolean judge(int num1, int num2, int p_sum) {
        int sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        if (p_sum == 0) {
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose");
            }
            else if (sum == 7 || sum == 11) {
                System.out.println("You win");
            }
            else {
                System.out.println("Point is " + sum);
                while (!judge(roll(), roll(), sum));
            }
            return true;
        }
        else {
            if (sum == p_sum) {
                System.out.println("You win");
                return true;
            }
            else if (sum == 7) {
                System.out.println("You lose");
                return true;
            }
            else return false;
        }
    }
    public static int roll() {
        return (int)(Math.random() * 6 + 1);
    }
}