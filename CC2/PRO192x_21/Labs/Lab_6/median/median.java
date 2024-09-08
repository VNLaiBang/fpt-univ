import java.util.Arrays;

public class median {
    public static int median(int[] arr) {
        Arrays.sort(arr);
        int med = ((arr.length - 1) / 2 + 1);
        return arr[med - 1]; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(median(arr));
    }
}
