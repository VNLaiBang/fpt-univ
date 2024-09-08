public class minGap {
    public static int minGap(int[] arr) {
        if (arr.length < 2) return 0;
        int minG = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minG) minG = arr[i + 1] - arr[i];
        }
        return minG;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        System.out.println(minGap(arr));
    }
}
