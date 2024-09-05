

public class Lanterns {
    public static void name() {
        String x = "    *****\n";
        String y = "  *********\n";
        String z = "*************\n";
        String w = "* | | | | | *\n";

        System.out.println(x + y + z + "\n" + x + y + z + w + z + x + y + z + "\n" + x + y + z + x + w + w + x + x);
    }

    public static void main(String[] args) {
        name();
    }
}
