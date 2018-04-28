public class randomPoint {
    public static void main(String[] args) {
		double R = 40;

        double alpha1 = Math.random()*2*Math.PI;
        double alpha2 = Math.random()*2*Math.PI;
        double alpha3 = Math.random()*2*Math.PI;

		double x1 = R*Math.cos(alpha1);
		double x2 = R*Math.cos(alpha2);
		double x3 = R*Math.cos(alpha3);
		double y1 = R*Math.sin(alpha1);
		double y2 = R*Math.sin(alpha2);
		double y3 = R*Math.sin(alpha3);

		double a = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
		double b = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double c = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

		double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

		System.out.println(A + " " + B + " " + C);
		System.out.println(A + B + C);
    }
}
