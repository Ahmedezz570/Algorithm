package DataTypes;

import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer =input.nextInt();
        long  l = input.nextLong();
        char character = input.next().charAt(0);
        double Double = input.nextDouble();
        float Float = input.nextFloat();

        System.out.println(integer+"\n"+l+"\n"+character+"\n"+Double+"\n"+Float);
    }
}
