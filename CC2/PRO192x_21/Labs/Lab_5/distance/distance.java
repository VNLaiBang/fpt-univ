public class distance {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x_gap = Math.pow(x2 - x1, 2);
        double y_gap = Math.pow(y2 - y1, 2);
        return Math.sqrt(x_gap + y_gap);
    }
    public static void main(String[] args) {
        System.out.println(distance(1, 0, 4, 4));
        System.out.println(distance(10, 2, 3, 5));
    }
}
