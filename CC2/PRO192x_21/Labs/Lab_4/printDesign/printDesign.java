public class printDesign {
    public static void printDesign() {
        // your code goes here
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(i * 2 + 1);
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDesign();
    }
}
