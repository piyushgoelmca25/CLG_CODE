package Collection;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class linkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // 1. Basic Add/Remove methods (from List interface)
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println("Initial List: " + ll); // [10, 20, 30]

        ll.remove(Integer.valueOf(20)); // Removes element 20
        System.out.println("After removing 20: " + ll);

        // 2. LinkedList Specific Methods (Deque operations)
        ll.addFirst(1);   // Adds to the start
        ll.addLast(100);  // Adds to the end
        System.out.println("After addFirst/Last: " + ll); // [1, 10, 30, 100]

        ll.removeFirst(); // Removes from start
        ll.removeLast();  // Removes from end
        System.out.println("After removeFirst/Last: " + ll); // [10, 30]

        // 3. Accessing elements
        System.out.println("First Element: " + ll.getFirst()); // 10
        System.out.println("Last Element: " + ll.getLast());   // 30

        // 4. Queue-like operations
        ll.add(40);
        System.out.println("Peek: " + ll.peek()); // Shows head without removing
        System.out.println("Poll: " + ll.poll()); // Retrieves and removes head (10)
        System.out.println("After Poll: " + ll);

        // 5. Searching and Indexing
        ll.add(30); // List: [30, 40, 30]
        System.out.println("Index of 30: " + ll.indexOf(30));       // First occurrence
        System.out.println("Last Index of 30: " + ll.lastIndexOf(30)); // Last occurrence

        // 6. Common Utility Methods
        System.out.println("Size: " + ll.size());
        System.out.println("Contains 40? " + ll.contains(40));
        
        // Sorting
        Collections.sort(ll);
        System.out.println("Sorted List: " + ll);

        // 7. Iterating using Iterator (Standard way)
        Iterator<Integer> it = ll.iterator();
        System.out.print("Iteration: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8. Clear the list
        ll.clear();
        System.out.println("List is empty: " + ll.isEmpty());
    }
}