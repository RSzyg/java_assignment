public class Q_09 {
    public static void main(String[] args) {
        RegularPolygon test1 = new RegularPolygon();
        RegularPolygon test2 = new RegularPolygon(6, 4);
        RegularPolygon test3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(test1.getPerimeter() + " " + test1.getArea());
        System.out.println(test2.getPerimeter() + " " + test2.getArea());
        System.out.println(test3.getPerimeter() + " " + test3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {}

    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
    }

    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN() {
        return n;
    }

    public void setN(int newN) {
        n = newN;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
        side = newSide;
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        x = newX;
    }
    
    public double getY() {
        return y;
    }

    public void setY(double newY) {
        y = newY;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}