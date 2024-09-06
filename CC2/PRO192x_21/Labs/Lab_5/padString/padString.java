public class padString {
    public static String padString(String s, int len) {
        if (len == s.length())
            return s;
        else {
            String a = "";
            for (int i = 0; i < (len - s.length()); i++)
                a += " ";
            return a + s;
        }
    }
    public static void main(String[] args) {
        System.out.println(padString("dinosaur", 20));
    }
}
