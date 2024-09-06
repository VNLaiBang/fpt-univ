public class printSquare {
    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= (i + max - min); j++) {
                if (j > max) System.out.print(min + j - max - 1);
                else System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printSquare(1, 5);
        printSquare(3, 9);
    }
    
}
