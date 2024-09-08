public class mode {
    public static int mode(int[] arr) {
        int[] arr100 = new int[101];
        for (int i = 0; i < 101; i++) {
            arr100[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            arr100[arr[i]] += 1;
        }
        int occ = 0;
        for (int i = 0; i < 101; i++) {
            if (arr100[i] > arr100[occ]) occ = i;
        }
        return occ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5};
        System.out.println(mode(arr));
    }
}
