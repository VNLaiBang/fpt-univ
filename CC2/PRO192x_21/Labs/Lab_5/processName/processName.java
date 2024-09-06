import java.util.Scanner;
public class processName {
    public static void processName(Scanner console) {
        System.out.print("Please enter your full name: ");
        String name = console.nextLine();
        int sep = name.indexOf(" ");
        System.out.print("Your name in reverse order is "+ name.substring(sep + 1, name.length()) +", "+ name.substring(0, sep));
    }
    public static void main(String[] args) {
        processName(new Scanner("Sammy Jankis\nerror"));
    }
}
