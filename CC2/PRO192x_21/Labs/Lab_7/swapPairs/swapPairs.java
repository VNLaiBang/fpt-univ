import java.util.ArrayList;
public class swapPairs{
    public static void swapPairs(ArrayList<String> arr){
        int range = arr.size();
        if (arr.size() % 2 != 2) range -= 1;

        for (int i = 0; i < range; i += 2){
            String temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("four");
        arr.add("score");
        arr.add("and");
        arr.add("seven");
        arr.add("years");
        arr.add("ago");

        swapPairs(arr);

        for (String s : arr){
            System.out.println(s);
        }
    }
}