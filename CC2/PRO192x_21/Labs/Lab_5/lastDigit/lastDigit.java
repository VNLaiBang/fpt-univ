public class lastDigit {
    public static int lastDigit(int num) {
        return Math.abs(num%10);
    }
    public static void main(String[] args) {
        System.out.println(lastDigit(-947));
    }
}
