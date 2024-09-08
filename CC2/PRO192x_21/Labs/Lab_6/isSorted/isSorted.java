public class isSorted {
    public static boolean isSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(new double[]{1, 2, 3, 6, 5}));
    }

}
