public class Egg2 {
    public static void name(String x) {
        // String y = "top mid bot";
        if (x.contains("top")) {
            System.out.println("  _______");
            System.out.println(" /       \\");
            System.out.println("/         \\");
        }

        if (x.contains("mid")) {
            System.out.println("-\"-'-\"-'-\"-");
        }

        if (x.contains("bot")) {
            System.out.println("\\         /");
            System.out.println(" \\_______/");
        }

    }

    public static void main(String[] args) {
        name("top bot");
        name("mid");
        name("top bot");
        name("mid bot");
        name("top mid bot");
    }
}
