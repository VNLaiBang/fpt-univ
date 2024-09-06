public class pay {
    public static double pay(double sal, int hours) {
        if (hours <= 8) return sal * hours;
        else return (sal * 8) + (sal * 3 / 2 * (hours - 8));
    }
    public static void main(String[] args) {
        System.out.println(pay(4.00, 11));
    }
}
