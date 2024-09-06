public class numbersOutputConstant {
    public static final int repetitions = 6;
    public static final int range = 10;

    public static void main(String[] args) {
        for (int k = 1; k <= repetitions; k++) {
            for (int i = 1; i < range; i++)
                System.out.print(" ");
            System.out.print("|");
        }
        System.out.println();
        for (int j = 1; j <= (range * repetitions); j++)
            System.out.print(j % range);
    }

}

