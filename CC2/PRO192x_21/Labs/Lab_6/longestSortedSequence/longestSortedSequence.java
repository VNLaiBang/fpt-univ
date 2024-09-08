public class longestSortedSequence {
    public static int longestSortedSequence(int[] arrays) {
        if (arrays == null) throw new IllegalArgumentException();
        if (arrays.length == 0) return 0;
        int count = 1;
        int max = 1;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] >= arrays[i - 1]) {
                count++;
                if (count > max) max = count;
            } else {
                count = 1;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] exp = {1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(longestSortedSequence(exp));
    }
}