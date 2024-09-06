public class quadrant {
    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(quadrant(1, 1)); // 1
        System.out.println(quadrant(-1, 1)); // 2
        System.out.println(quadrant(-1, -1)); // 3
        System.out.println(quadrant(1, -1)); // 4
        System.out.println(quadrant(0, 0)); // 0
    }
}
