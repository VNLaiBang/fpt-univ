public class range {
    public static int range(int[] arrays) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arrays.length; i++) {
            if(arrays[i] < min) {
                min = arrays[i];
            }
            
            if(arrays[i] > max) {
                max = arrays[i];
            }
        }
        
        return max - min + 1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 10000000, 5, -29, 4};
        System.out.println(range(arr));
    }
    
}
