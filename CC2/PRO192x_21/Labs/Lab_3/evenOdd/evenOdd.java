import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Type a number: ");
    int a = read.nextInt();

    if(a % 2 == 0)
    {
        System.out.print("even\n");
    }else
    {
        System.out.print("odd\n");
    }

    }
}
