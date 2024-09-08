public class lastIndexOf {
    public static int lastIndexOf(int[] arrays, int a) {
        int index = -1;
        if (arrays == null) throw new IllegalArgumentException(); 
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == a) index = i;
        } 
        return index;
    }
    
    public static void main(String[] args) {
        int[] exp = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(lastIndexOf(exp, 85));
    }
}
