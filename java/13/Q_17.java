import myclass.Complex;

public class Q_17 {

    public static void main(String[] args) {

        System.out.println(new Complex(3.5, 5.5).add(new Complex(-3.5, 1)));
        System.out.println(new Complex(3.5, 5.5).subtract(new Complex(-3.5, 1)));

        System.out.println(new Complex(3.5, 5.5).multiply(new Complex(-3.5, 1)));
        System.out.println(new Complex(3.5, 5.5).divide(new Complex(-3.5, 1)));
    }


}