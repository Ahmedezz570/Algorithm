import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        int [] arr2 = {8,2,3,4,5};
        System.out.println("First element"+" "+arr2[0]);
        arr2[1]=10;
        System.out.println("Second element"+" "+arr2[1]);

        System.out.println(arr2.length); // 5

        for (int i = 0; i <arr2.length ; i++) {  // from 0 to 4
            System.out.println(arr2[i]);
            System.out.println("index of array = "+" " +i);
        }
     // using for-each
        for (int val : arr2){
            System.out.println("elemet of array using for-each"+" "+val);
        }

     // sum of all element of array
        int sum = 0 ;
        for (int i = 0; i <arr2.length ; i++) { // 0 to 4 = 5 times
            sum = sum +arr2[i];
            System.out.println("Sum Of index"+" "+(i+1)+" = " +" "+sum);
        }
        System.out.println("Final Sum = " +" "+sum);

        // Search from element
        int target = 33;
        boolean found = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                System.out.println("Done");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
      // Find max and min
      int max = arr2[0];
      int min = arr2[0];
      for (int val : arr2){
          if (val>max) {
              System.out.println("Val Max =" + val);
              max = val;
          }
          if (val<min) {
              System.out.println("Val Min =" + val);
              min = val;

      }

    }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // Reverse Array
        // {8,2,3,4,5}
        for (int i = 0; i <arr2.length/2 ; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length-1 -i];
            arr2[arr2.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
