public class fibonacci {
    public static void main(String[] args) {
        int u0 = 1;
        int u1 = 1;
        int un;
        System.out.print(u0 + " " + u1 + " ");
        for (un = 2; un <= 144; un = u0 + u1) {
            System.out.print(un + " ");
            u0 = u1;
            u1 = un;
        }
    }
}
