public class stdev {
    public static double stdev(int[] arr) {
        int len = arr.length;
        double mean = 0;
        for (int i = 0; i < len; i++) {
            mean += arr[i];
        }
        mean /= (double)len;
        double res = 0.;
        for (int i = 0; i < len; i++) {
            res += Math.pow((arr[i] - mean),2);
        }
        return Math.sqrt(res / (len - 1));
    }

    public static void main(String[] args) {
        int[] ex = {1,2,3};
        System.out.println(stdev(ex));
    }
    
}
