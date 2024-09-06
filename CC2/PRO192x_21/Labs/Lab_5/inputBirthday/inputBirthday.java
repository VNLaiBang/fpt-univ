import java.util.Scanner;

public class inputBirthday {
    
    public static void inputBirthday(Scanner console) {
        String a, b, c;
        System.out.print("On what day of the month were you born? ");
        a = console.nextLine();
        System.out.print("What is the name of the month in which you were born? ");
        b = console.nextLine();
        System.out.print("During what year were you born? ");
        c = console.nextLine();
        System.out.print("You were born on " + b +" " + a + ", " + c +". You're mighty old!");
    }

    public static void main(String[] args) {
        inputBirthday(new Scanner("8\nMay\n1981\n "));
    }
}
