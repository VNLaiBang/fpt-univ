public class displacement {
    public static void main(String[] args) {
        double s0 = 12.;
        double v0 = 3.5;
        double a = 9.8;
        double t = 10.;
        double s = s0 + v0 * t + 0.5 * a * t * t;
        System.out.println(s);
    }

}
