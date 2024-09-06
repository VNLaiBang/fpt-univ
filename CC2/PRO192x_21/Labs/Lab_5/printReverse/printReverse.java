public class printReverse {
    public static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
    public static void main(String[] args) {
        printReverse(" BooYah!! ");
    }
}
