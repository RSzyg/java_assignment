import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The roots are " + equation.getRoot1()
                    + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The root is " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");

        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
         return b * b - 4.0 * a * c;
    }

    public double getRoot1() {
            return  (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }

    public double getRoot2() {
            return  (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }
}