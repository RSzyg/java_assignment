import myclass.Circle2D;
import myclass.GeometricObject;

public class Q_06 {

    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(0,0,5);
        ComparableCircle c2 = new ComparableCircle(0,0,10);
        ComparableCircle c3 = (ComparableCircle) GeometricObject.max(c1, c2);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Max circle = " + c3.getRadius());
        System.out.println(c3);
    }
}


class ComparableCircle  extends Circle2D { // GeometricObject Implements compareTo

    ComparableCircle() {
    }

    ComparableCircle(double x, double y, double radius) {
        super(x, y, radius);
    }
}