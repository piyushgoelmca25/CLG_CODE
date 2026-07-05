package Collection;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> st = new Stack<>();

        // 1. push(): Adds an element to the top of the stack
        st.push(10);
        st.push(11);
        st.push(12);
        System.out.println("Stack after pushes: " + st); // [10, 11, 12]

        // 2. pop(): Removes and returns the top element
        // In this case, 12 is at the top (right-most)
        int poppedElement = st.pop(); 
        System.out.println("Popped element: " + poppedElement); // 12
        System.out.println("Stack after pop: " + st); // [10, 11]

        // 3. peek(): Looks at the top element without removing it
        int topElement = st.peek();
        System.out.println("Top element (peek): " + topElement); // 11

        // 4. search(): Returns the 1-based position from the top
        // The top-most item is considered distance 1
        st.push(12); // Stack: [10, 11, 12]
        int position = st.search(11); 
        System.out.println("Position of 11 from top: " + position); // 2
        
        // Searching for an element not in the stack returns -1
        System.out.println("Position of 99: " + st.search(99)); // -1

        // 5. empty(): Checks if the stack is empty
        System.out.println("Is stack empty? " + st.empty()); // false

        // Example of clearing the stack
        while(!st.empty()) {
            st.pop();
        }
        System.out.println("Stack after clearing: " + st); // []
    }
}
