public class printPowersOf2 {
    public static void printPowersOf2(int puis) {
        for (int i = 0; i <= puis; i++)
            System.out.print(((int) Math.pow(2, i)) + " ");
    }

    public static void main(String[] args) {
        printPowersOf2(5);
    }
}
