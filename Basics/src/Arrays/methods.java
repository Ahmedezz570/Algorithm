package Arrays;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        int [] arr1 = {4, 5 ,99 , 3 , 101};
        int [] arr3 = {4, 5 ,99 , 3 , 101};

        System.out.println(Arrays.equals(arr1 , arr3));

        System.out.println("Length: " + arr1.length);

        Arrays.sort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int[] arr2 = Arrays.copyOf(arr1, 8);

        System.out.println("Copy: " + Arrays.toString(arr2));

        Arrays.fill(arr2, 4, 6, 98);
        System.out.println("Filled: " + Arrays.toString(arr2));

        // Must be sorted
        int idx = Arrays.binarySearch(arr1, 5);
        System.out.println("Index of 5: " + idx);

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Equal? " + isEqual);

        int[] subArr = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println("Sub Array: " + Arrays.toString(subArr));
    }
}
