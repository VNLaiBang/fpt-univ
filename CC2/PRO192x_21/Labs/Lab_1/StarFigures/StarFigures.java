public class StarFigures {
    public static void star() {
        String x = "*****\n*****\n";
        String y = " * *\n  *\n * *\n";
        String z = "  *\n  *\n  *\n";
        System.out.println(x + y + "\n" + x + y + x + "\n" + z + x + y);
    }


    public static void main(String[] args) {
        star();
    }
}
