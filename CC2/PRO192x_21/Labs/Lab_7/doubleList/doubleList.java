import java.util.ArrayList;
public class doubleList {
    public static void doubleList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.add(i, arr.get(i++));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("hi");
        arr.add("goodbye");
        arr.add("bye");
        arr.add("good");
        arr.add("bad");
        doubleList(arr);
        System.out.println(arr);
    }
}