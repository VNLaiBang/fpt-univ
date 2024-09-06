public class scientific {
    public static double scientific(double a, double b) {
        int power = (int)b;
        return a*Math.pow(10, b);
    }
    
    public static void main(String[] args) {
        System.out.println(scientific(6.23, 5));
        System.out.println(scientific(4.0, 0));
    }
}
