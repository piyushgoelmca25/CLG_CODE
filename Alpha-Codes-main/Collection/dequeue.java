package Collection;
import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        System.out.println("--- 1. INSERTION ---");
        // Inserting at the rear (like a normal queue)
        dq.offerLast(20);
        dq.offerLast(30);
        
        // Inserting at the front
        dq.offerFirst(10);
        dq.offerFirst(5);
        
        // Current state: [5, 10, 20, 30]
        System.out.println("Deque after insertions: " + dq); 


        System.out.println("\n--- 2. EXAMINING (Peeking) ---");
        // Looking at elements without removing them
        System.out.println("Front Element: " + dq.peekFirst()); // 5
        System.out.println("Rear Element: " + dq.peekLast());   // 30


        System.out.println("\n--- 3. REMOVAL ---");
        // Removing from the front
        int removedFront = dq.pollFirst(); 
        System.out.println("Removed from front: " + removedFront); // 5
        
        // Removing from the rear
        int removedRear = dq.pollLast(); 
        System.out.println("Removed from rear: " + removedRear);   // 30
        
        // Current state: [10, 20]
        System.out.println("Deque after removals: " + dq);


        System.out.println("\n--- 4. USING DEQUE AS A STACK ---");
        
        // ArrayDeque is actually the recommended replacement for the legacy Stack class!
        Deque<String> stack = new ArrayDeque<>();
        
        // Push adds to the front
        stack.push("Bottom Plate");
        stack.push("Middle Plate");
        stack.push("Top Plate");
        System.out.println("Stack state: " + stack); // [Top Plate, Middle Plate, Bottom Plate]
        
        // Pop removes from the front
        System.out.println("Popped: " + stack.pop()); // Top Plate
        System.out.println("Stack after pop: " + stack); // [Middle Plate, Bottom Plate]
    }
}