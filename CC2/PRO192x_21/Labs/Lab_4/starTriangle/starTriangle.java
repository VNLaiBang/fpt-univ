public class starTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String a = "";
            for (int j = 0; j < i; j++) {
                a += "*";
            }
            System.out.println(a);
        }
    }
}
