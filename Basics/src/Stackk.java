import java.util.Stack;
public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(100);
        s1.push(200);
        s1.push(300);
        s1.push(400);
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        if (!s1.isEmpty())
            System.out.println("Stack Is Not Empty");
// LIFO
    }
}
