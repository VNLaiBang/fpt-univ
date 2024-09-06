public class loopSquares {
    public static void main(String[] args) {
        int val;
        int gap = 1;
        for (val = 1; val <= 100; val += gap) {
            System.out.print(val + " ");
            gap += 2;
        }
    }
}
