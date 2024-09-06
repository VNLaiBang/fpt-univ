public class quadratic {
    public static void quadratic(int a, int b, int  c) {
        double delta = b*b - 4*a*c;
        System.out.println("First root = " + ((-b + Math.sqrt(delta))/(2*a)));
        System.out.println("Second root = " + ((-b - Math.sqrt(delta))/(2*a)));
    }
    public static void main(String[] args) {
        quadratic(1, -7, 12);
    }
}
