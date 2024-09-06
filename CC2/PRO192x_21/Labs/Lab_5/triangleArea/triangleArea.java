public class triangleArea {
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.;
        return Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }
    public static void main(String[] args) {
        System.out.println(triangleArea(8.0, 5.2, 7.1));
    }
}
