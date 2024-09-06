public class numUnique {
    public static int numUnique(int a, int b, int c) {
        int num = 3;
        if (a == b) {
            num -= 1;
            if (b == c) {
                return num - 1;
            } else {
                return num;
            }
        } else {
            if (b == c) {
                num -= 1;
            } else {
                if (a == c) {
                    return num - 1;
                } else {
                    return num;
                }         
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(numUnique(1, 2, 3));
        System.out.println(numUnique(1, 1, 2));
        System.out.println(numUnique(1, 2, 2));
        System.out.println(numUnique(1, 1, 1));
    }
}
