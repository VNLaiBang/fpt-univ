public class printNumbers {
    public static void printNumbers(int max) {
        for (int i = 1; i <= max; i++)
            System.out.print("[" + i +"] ");
    }

    public static void main(String[] args) {
        printNumbers(15);
    }
}
