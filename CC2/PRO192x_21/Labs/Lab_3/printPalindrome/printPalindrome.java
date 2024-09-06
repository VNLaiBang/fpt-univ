import java.util.Scanner;

public class printPalindrome {
    public static void printPalindrome(Scanner console) {
        System.out.print("Type one or more words: ");
        String w = console.nextLine();
        String w_lower = w.toLowerCase();
        int i = 0;
        int j = w.length() - 1;
        while (i < j) {
            if (w_lower.charAt(i) != w_lower.charAt(j)) {
                System.out.println(w + " is not a palindrome.");
                    return;
            }
            i++;
            j--;
        }
        System.out.println(w + " is a palindrome!");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printPalindrome(console);
    }
}
