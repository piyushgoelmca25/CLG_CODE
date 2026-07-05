package Collection;
import java.util.*;
public class arraylist {
        public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List: " + list); // [10, 20, 30, 40]

        // Remove element at specific index
        list.remove(0); // Removes 10
        System.out.println("After Remove: " + list); // [20, 30, 40]

        // AddAll and RemoveAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2); // Merges list2 into list
        System.out.println("After AddAll: " + list); // [20, 30, 40, 101, 102, 20]
        
        list.removeAll(list2); // Removes all elements present in list2
        System.out.println("After RemoveAll: " + list); // [30, 40]

        // // Size and Clear
        System.out.println("Size: " + list.size()); // 2
        list.clear();
        System.out.println("After Clear Size: " + list.size()); // 0

        Iterator<Integer> iterator = list2.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next()); // Accesses and prints next element
            }

        // Get and Set
        list.get(0); // Fetches element at index 0
        list.set(0, 100); // Replaces element at index 0 with 100

        // Sorting (requires Collections class)
        Collections.sort(list); // Sorts in ascending order
        System.out.println("Sorted List: " + list); // Prints sorted list
        Collections.sort(list, Collections.reverseOrder()); // Sorts in descending order

        System.out.println("Contains 30: " + list.contains(30)); // Checks if 30 is present

        Object[] array = list.toArray(); // Converts list to array
        System.out.println("Array: " + Arrays.toString(array)); // Prints array

        // List<Integer> newlist = (List<Integer>)list.clone();

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.ensureCapacity(100);

        // Check capacity, empty, and index
        boolean isEmpty = list3.isEmpty(); // Returns true if empty
        int index = list2.indexOf(40); // Returns index of element 40
    }
}
