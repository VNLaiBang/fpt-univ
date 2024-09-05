public class EggStop {
    public static void name(String x) {
        if (x.contains("top")) {
            System.out.println("  ______");
            System.out.println(" /      \\");
            System.out.println("/        \\");
        }

        if (x.contains("mid")) {
            System.out.println("+--------+");
        }

        if (x.contains("stop")) {
            System.out.println("|  STOP  |");
        }

        if (x.contains("bot")) {
            System.out.println("\\        /");
            System.out.println(" \\______/");
        }
        
        if (x.contains("\n")) {
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        name("top bot \n");
        name("top bot");
        name("mid \n");
        name("top stop bot");
        name("mid \n");
    }
}
