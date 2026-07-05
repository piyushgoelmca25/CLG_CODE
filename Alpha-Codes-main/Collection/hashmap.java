package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class hashmap {
    public static void main(String[] args) {
        // 1. Create a HashMap
        Map<String, String> table = new HashMap<>();

        // 2. Insertion (put)
        table.put("IN", "India");
        table.put("US", "United States");
        table.put("BR", "Brazil");

        // Updating an existing key
        table.put("IN", "India Updated"); // Overwrites the old value
        
        // 3. putIfAbsent - Only inserts if the key is NOT already present
        table.putIfAbsent("IN", "India 3"); // Ignored, "IN" exists
        table.putIfAbsent("ES", "Spain");   // Inserted successfully

        System.out.println("Map State: " + table);

        // 4. Accessing elements (get & getOrDefault)
        System.out.println("Value for 'BR': " + table.get("BR")); // Brazil
        // getOrDefault avoids returning null if key is missing
        System.out.println("Value for 'UK': " + table.getOrDefault("UK", "Not Found")); // Not Found

        // 5. Checking presence
        System.out.println("Contains key 'US'? " + table.containsKey("US")); // true
        System.out.println("Contains value 'Spain'? " + table.containsValue("Spain")); // true

        // 6. Replacing values
        table.replace("IN", "Indonesia"); 
        
        // 7. Extracting Data (KeySet, Values, EntrySet)
        
        // A. Getting all Keys (Returns a Set because keys are unique)
        Set<String> keys = table.keySet();
        System.out.println("All Keys: " + keys);

        // B. Getting all Values (Returns a Collection because values can duplicate)
        Collection<String> values = table.values();
        System.out.println("All Values: " + values);

        // C. Getting all Entries (Key-Value pairs)
        Set<Map.Entry<String, String>> entries = table.entrySet();
        System.out.println("All Entries: " + entries);

        // 8. Iterating over a Map
        System.out.println("\nIterating through Map:");
        for (Map.Entry<String, String> entry : table.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 9. Removal and size
        table.remove("ES");
        System.out.println("Size after removal: " + table.size());
        table.clear(); // Empties the map
    }
}