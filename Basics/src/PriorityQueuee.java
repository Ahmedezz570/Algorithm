import java.util.PriorityQueue;
public class PriorityQueuee {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(200);
        pq.add(100);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        pq.add(800);
        System.out.println( pq.poll());
        // Responding Priority
    }
}
