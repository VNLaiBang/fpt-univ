import java.util.Arrays;

public class kthLargest {

    public static int kthLargest(int k, int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - k - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
        System.out.println(kthLargest(k, arr));
    }
}
