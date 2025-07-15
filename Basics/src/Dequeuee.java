import java.util.*;
public class Dequeuee {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(100);
        d1.addFirst(200);
        d1.addLast(300);
        System.out.println(d1);
        System.out.println( d1.peekFirst());
        System.out.println(d1.peekLast());
        d1.remove();
        d1.removeFirst();
        d1.removeLast();
        System.out.println(d1);
// LIFO & FIFO
    }
}
