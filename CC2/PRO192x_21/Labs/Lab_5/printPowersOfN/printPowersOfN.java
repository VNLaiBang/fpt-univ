public class printPowersOfN {
    public static void printPowersOfN(int base, int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(((int) Math.pow(base, i)) + " ");
        }
    }

    public static void main(String[] args) {
        printPowersOfN(4, 3);
    }
}
