// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        int x = 38 + 40 + 30;
        double tax = x * 0.08;
        double tip = x * 0.15;
        double total = x + tax + tip;
        System.out.println("Subtotal:\n" + x);
        System.out.println("Tax:\n" + tax);
        System.out.println("Tip:\n" + tip);
        System.out.println("Total:\n" + total);
    }
}