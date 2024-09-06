import java.util.Scanner;

public class colors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String s = read.next();
        String a = "You have chosen ";
        read.close();
        switch (s) {
            case "B":
            case "b":
                System.out.print(a + "Blue.\n");
                break;
            case "G":
            case "g":
                System.out.print(a + "Green.\n");
                break;
            case "R":
            case "r":
                System.out.print(a + "Red.\n");
                break;
            default:
                System.out.print("Unknown color: " + s);
                break;
        }
    }
}
