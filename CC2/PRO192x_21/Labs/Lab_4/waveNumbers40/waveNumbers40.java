public class waveNumbers40 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println("");
        for (i = 0; i < 40; i++) {
            int j = i % 4;
            switch (j) {
                case 0:
                    System.out.print("_");
                    break;
                case 1:
                case 3:
                    System.out.print("-");
                    break;
                case 2:
                    System.out.print("^");
                    break;
            }
        }
        System.out.println("");
        for (i = 1; i <= 40; i++) {
            int j = i;
            if (j % 2 != 0) {
                j += 1;
            }
            j = (j % 20) / 2;
            System.out.print(j);
        }
        System.out.println("");
        for (i = 0; i < 40; i++) {
            System.out.print("-");
        }
    }

}
