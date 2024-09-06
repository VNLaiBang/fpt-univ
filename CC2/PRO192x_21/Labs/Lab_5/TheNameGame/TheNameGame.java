import java.util.Scanner;

public class TheNameGame{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String full_name = console.nextLine();
        int sep = full_name.indexOf(" ");
        String f = full_name.substring(0, sep);
        String l = full_name.substring(sep + 1, full_name.length());
    
        System.out.println(f + " " + f + ", bo-B" + f.substring(1, f.length()));
        System.out.println("Banana-fana fo-F" + f.substring(1, f.length()));
        System.out.println("Fee-fi-mo-M" + f.substring(1, f.length()));
        System.out.println(f.toUpperCase() + "!\n");
        System.out.println(l + " " + l + ", bo-B" + l.substring(1, l.length()));
        System.out.println("Banana-fana fo-F" + l.substring(1, l.length()));
        System.out.println("Fee-fi-mo-M" + l.substring(1, l.length()));
        System.out.println(l.toUpperCase() + "!");
    }
}
