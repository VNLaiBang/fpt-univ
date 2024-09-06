public class SlashFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }
            for (int k = 0; k < (11 - i) * 2; k++) {
                System.out.print("!");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }    
}