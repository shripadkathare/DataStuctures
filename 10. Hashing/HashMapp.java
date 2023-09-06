import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
         // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Accessing values using keys
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Checking if the HashMap contains a key
        System.out.println("Contains key 3? " + hashMap.containsKey(3));

        // Checking if the HashMap contains a value
        System.out.println("Contains value 'Four'? " + hashMap.containsValue("Four"));

        // Getting the size of the HashMap
        System.out.println("HashMap size: " + hashMap.size());

        // Removing a key-value pair
        hashMap.remove(1);
        System.out.println("HashMap after removing key 1: " + hashMap);

        // Iterating through the HashMap using a loop
        System.out.println("Iterating through the HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
