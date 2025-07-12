package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Object> mixed  = new ArrayList<>();

        list1.add(10);
        list1.add(16);
        list1.add(17);
        list1.add(22);
        list1.add(90);
        list1.add(16400);
        list1.add(4, 100); // add at index 4
        list1.set(4, 10000); // edit last element

        System.out.println(list1.isEmpty());       // false
        System.out.println(list1.get(4));          // 100
        System.out.println(list1.get(4));          // 10000
        System.out.println(list1.size());          // 7
        System.out.println(list1.contains(16400)); // true

        list1.remove(4);                           // remove 100
        System.out.println(list1.toString());      // [10, 16, 17, 22, 90, 16400, 10000]
        list1.clear();                             // clear all
        System.out.println(list1.toString());      // []


        mixed.add("Ahmed");
        mixed.add(5);
        mixed.add(3.14);
        mixed.add(false);
        System.out.println(mixed.toString());

        // Transform from Array to ArrayList
        String [] arr = {"E" , "Z" , "Z" };
        ArrayList<String> trans1 = new ArrayList<>(Arrays.asList(arr));
        for(String val : trans1){
            System.out.println(val+" ");
        }
        // Transform from ArrayList to Array
        ArrayList<String> trans2 = new ArrayList<>();
        trans2.add("Ahmed");
        trans2.add("Ezz");

        String [] arr2 = trans2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));



    }
}
