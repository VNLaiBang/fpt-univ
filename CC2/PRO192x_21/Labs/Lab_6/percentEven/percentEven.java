public class percentEven {
    public static double percentEven(int[] arr) {
        if (arr.length == 0) return 0.0;
        double numEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                numEven += 1; 
            }
        }
        return numEven / arr.length * 100;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 11, 3};
        System.out.println(percentEven(arr));
    }
}
