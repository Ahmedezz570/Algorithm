import java.util.LinkedList;
import java.util.Queue;
public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(100);
        q1.add(200);
        q1.add(300);
        q1.add(400);
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        System.out.println(q1.peek());
        // FIFO
    }
}
