package Collection;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        // --- 1. Default PriorityQueue (Min-Heap) ---
        Queue<Integer> minPQ = new PriorityQueue<>();
        minPQ.offer(40);
        minPQ.offer(30);
        minPQ.offer(10);
        minPQ.offer(20);

        System.out.println("Min-Heap Polling:");
        while (!minPQ.isEmpty()) {
            // Will print in ascending order: 10, 20, 30, 40
            System.out.print(minPQ.poll() + " "); 
        }
        System.out.println();

        // --- 2. Custom PriorityQueue (Max-Heap) ---
        // Using a Lambda expression Comparator (b - a) to reverse default priority
        Queue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        maxPQ.offer(40);
        maxPQ.offer(30);
        maxPQ.offer(10);
        maxPQ.offer(20);

        System.out.println("Max-Heap Polling:");
        while (!maxPQ.isEmpty()) {
            // Will print in descending order: 40, 30, 20, 10
            System.out.print(maxPQ.poll() + " "); 
        }
    }
}
