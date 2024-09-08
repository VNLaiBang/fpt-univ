public class countInRange {
    public static int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) count++; 
        }
        return count;
    }
    public static void main(String[] args) {
        int[] exp = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(exp, 4, 17));
    }
    
}
