package Arrays;
import java.util.Arrays;
public class Array2D {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        System.out.println(matrix2[0][1]);
// Print all Values Of 2D Array
        for (int i = 0; i < matrix2.length; i++) { // Rows
            for (int j = 0; j < matrix2.length; j++) { // Columns
                System.out.println("index of row"+" " +i+" index of column"+" "+j);
                System.out.println(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        // Sum oF Elements
        int sum = 0;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                sum += matrix2[i][j];
            }
        }

        System.out.println("Total sum = " + sum);
       // Multiplication Table
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        // Count evenNumbers
        int count = 0;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (matrix2[i][j] % 2 == 0) {
                    count++;
                    System.out.println(matrix2[i][j]);
                }
            }
        }
        System.out.println("Number Of Even = " + count);

// Another Solution To Print 2D Array
        System.out.println(Arrays.deepToString(matrix2));

        int[][] jagged = {
                {1, 2},
                {3, 4, 5},
                {6}
        };
        System.out.println(Arrays.deepToString(jagged));


        int[] result = PrintPartOfArray(matrix2);
        for (int val : result) {
            System.out.print(val + " ");
        }

    }
    public static int[] PrintPartOfArray(int[][] array) {
        int[] firstElements = new int[array.length];
        System.out.println("Length Of array[0] = " +array[0].length);
        for (int i = 0; i < array[0].length; i++) {
                firstElements[i] = array[1][i];
        }
        return firstElements;
    }

}
