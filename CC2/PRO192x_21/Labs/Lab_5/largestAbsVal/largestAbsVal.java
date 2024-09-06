public class largestAbsVal {
    public static int largestAbsVal(int a, int b, int c) {
        if (Math.abs(a) > Math.abs(b)) {
            if (Math.abs(a) > Math.abs(c)) return Math.abs(a);
            else return Math.abs(c);
        } else {
            if (Math.abs(b) > Math.abs(c)) return Math.abs(b);
            else return Math.abs(c);
        }
    }
    public static void main(String[] args) {
        System.out.println(largestAbsVal(1, 5, -9));
    }
}
