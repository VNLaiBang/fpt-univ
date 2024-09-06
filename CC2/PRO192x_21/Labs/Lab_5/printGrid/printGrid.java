public class printGrid {
    public static void printGrid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            int max = i + (rows * (cols - 1));
            for (int j = i; j <= max; j+= rows) {
                if (j == max) System.out.print(j); 
                else System.out.print(j + ", ");
                
            } 
            System.out.println("");
        }
    
    }
    public static void main(String[] args) {
        printGrid(4, 6);
    }
}
