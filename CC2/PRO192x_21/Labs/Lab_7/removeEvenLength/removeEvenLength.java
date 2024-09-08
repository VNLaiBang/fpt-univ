import java.util.ArrayList;
public class removeEvenLength {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("hi");
        arr.add("goodbye");
        arr.add("bye");
        arr.add("good");
        arr.add("bad");
        arr.add("good");
        arr.add("bad");
        removeEvenLength(arr);
        System.out.println(arr);
    }

    public static void removeEvenLength(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
    }
}
