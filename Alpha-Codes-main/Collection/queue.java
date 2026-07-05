package Collection;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class queue {
    public static void main(String[] args) {
        // --- 1. Standard Queue using LinkedList ---
        Queue<Integer> q = new LinkedList<>();
        
        // Insertion (Use offer instead of add)
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Standard Queue: " + q); // [10, 20, 30]

        // Access Front Element (Use peek instead of element)
        System.out.println("Front Element: " + q.peek()); // 10

        // Removal (Use poll instead of remove)
        System.out.println("Removed Element: " + q.poll()); // Removes 10
        System.out.println("After Poll: " + q); // [20, 30]


        // --- 2. Double Ended Queue (Deque) using ArrayDeque ---
        // ArrayDeque allows insertion/removal from BOTH ends
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.offerFirst(10); // Insert at front
        dq.offerLast(50);  // Insert at rear
        dq.offerFirst(5);  // Insert at front
        System.out.println("Deque: " + dq); // [5, 10, 50]

        System.out.println("Peek First: " + dq.peekFirst()); // 5
        System.out.println("Peek Last: " + dq.peekLast());   // 50

        dq.pollFirst(); // Removes 5
        dq.pollLast();  // Removes 50
        System.out.println("Deque after polls: " + dq); // [10]
        
        // Note: ArrayDeque can also be used to implement a Stack!
        // dq.push(100); dq.pop(); 
    }
}
