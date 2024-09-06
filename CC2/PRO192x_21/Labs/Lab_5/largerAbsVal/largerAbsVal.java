public class largerAbsVal {
    public static int largerAbsVal(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) return Math.abs(a);
        else return Math.abs(b);
    }
    public static void main(String[] args) {
        System.out.println(largerAbsVal(-4, 5));
    }
}
