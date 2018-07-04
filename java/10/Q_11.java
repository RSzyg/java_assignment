import javafx.scene.shape.Circle;

public class Q_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
        System.out.println("Does c1 contain coordinate (3,3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain circle 2? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does c1 overlap circle 3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject o : a) {
            sum += o.getArea();
        }
        return sum;
    }
    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public double x() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double y() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point point) {

        return distance(point.x, point.y);
    }

    public Point getCenterPoint(Point p) {

        return new Point((p.x + this.x) / 2, (p.y + this.y) / 2);
    }

    public static Point getCenterPoint(double x1, double y1, double x2, double y2) {
        return new Point((x1 + x2) / 2, (y1 + y2) / 2);
    }

    /** Return true if this point is on the left side of the
     *  directed line from p0 to p1 */
    public boolean leftOfTheLine(Point p0, Point p1) {

        return leftOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
    }

    /** Return true if this point is on the same
     *  line from p0 to p1 */
    public boolean onTheSameLine(Point p0, Point p1) {

        return onTheSameLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    /** Return true if this point is on the right side of the
     *  directed line from p0 to p1 */
    public boolean rightOfTheLine(Point p0, Point p1) {

        return rightOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    /** Return true if this point is on the
     *  line segment from p0 to p1 */
    public boolean onTheLineSegment(Point p0, Point p1) {

        return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);

    }


    /** Return true if point (x2, y2) is on the left side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }
    /** Return true if point (x2, y2) is on the same
     *  line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }

    /** Return true if point (x2, y2) is on the right side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class Circle2D  extends GeometricObject {

    private double x;
    private double y;
    private double radius;

    public Circle2D(Circle c) {
        this(c.getCenterX(), c.getCenterY(), c.getRadius());
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D() {
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {

        return 2 * radius * Math.PI;

    }

    public boolean contains(Circle2D circle2D) {
        double distance = getPoint().distance(circle2D.x, circle2D.y);

        if (distance <= Math.abs(this.radius - circle2D.radius)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean c1ContainsC2(Circle c1, Circle c2) {
        Circle2D cir1 = new Circle2D(c1);
        Circle2D cir2 =new Circle2D(c2);

        return cir1.contains(cir2);
    }

    public static boolean c1OverlapsC2(Circle c1, Circle c2) {
        Circle2D cir1 = new Circle2D(c1);
        Circle2D cir2 =new Circle2D(c2);

        if (cir1.contains(cir2) || cir2.contains(cir1)) return false;

        return cir1.overlaps(cir2);
    }

    public boolean overlaps(Circle2D circle2D) {
        double distance = getPoint().distance(circle2D.x, circle2D.y);

        if (distance  <= this.radius + circle2D.radius)
            return true;
        else
            return false;

    }

    private Point getPoint() {
        return new Point(this.x, this.y);
    }

    @Override
    public String toString() {
        return "Circle2D{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    public boolean contains(double x, double y) {

        double distance = getPoint().distance(x, y);

        if (distance <= radius) return true;
        else return false;
    }
}