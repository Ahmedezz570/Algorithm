package ArrayList;
import java.util.Arrays;
import java.util.Vector;
public class Vectorr {
    public static void main(String[] args) {
       // Dynamic Array
        Vector<Integer> v1 = new Vector<>();
        v1.add(111111);
        v1.add(90);
        System.out.println(v1);

        Vector<String> names = new Vector<>();

        names.add("Ahmed");
        names.add("Mona");
        names.add("Ziad");
        for (String val : names){
            System.out.println(val);
        }
        // Print element
        System.out.println("First name: " + names.get(0));
        // Remove element
        names.remove(1);
        // Update element
        names.set(1, "Kareem");

        System.out.println(names);
        names.clear();
        System.out.println("This is Vector After Clear "+names);

        Vector<Integer> v2 = new Vector<>();
        for (int i = 1; i <=10 ; i++) {
            v2.add(i);
        }
        System.out.println("Array After Insert " + v2);
        int  sum = 0 ;
        System.out.println("Length Of V2 " + v2.size());
        for (int i = 0; i <v2.size() ; i++) {
            sum += v2.get(i);
        }
        System.out.println("Sum Of All Element = " + sum);

        Vector<Integer> v3 = new Vector<>();
        System.out.println("Initial Capacity Of Vector = " + v3.capacity());
    }
}


