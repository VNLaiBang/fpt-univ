public class contains {
    public static boolean contains(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) throw new IllegalArgumentException();
        if (a1.length == 0 || a2.length == 0) return false;
        if (a1 == a2) return true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[0]) {
                boolean found = true;
                for (int j = 1; j < a2.length; j++) {
                    if (i + j >= a1.length || a1[i + j] != a2[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }
        return false;
    }

    public static main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a2 = {5, 6, 7};
        System.out.println(contains(a1, a2));
    }
}
