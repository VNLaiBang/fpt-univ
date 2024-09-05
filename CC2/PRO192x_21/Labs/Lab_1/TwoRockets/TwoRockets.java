

public class TwoRockets {
    public static void name1(int num) {
        if (num == 1) {
            System.out.println("   /\\       /\\");
        } else if (num == 2) {
            System.out.println("  /  \\     /  \\");
        } else if (num == 3) {
            System.out.println(" /    \\   /    \\");
        } else {
            System.out.println("Unknown number");
            assert (false);
        }
    }

    public static void name() {
        String x = "+------+ +------+";
        String y = "|      | |      |";
        String z = "|United| |United|";
        String w = "|States| |States|";
        name1(1);
        name1(2);
        name1(3);
        System.out.println(
                x + "\n" + y + "\n" + y + "\n" + x + "\n" + z + "\n" + w + "\n" + x + "\n" + y + "\n" + y + "\n" + x);
        name1(1);
        name1(2);
        name1(3);
    }

    public static void main(String[] args) {
        name();
    }
}
