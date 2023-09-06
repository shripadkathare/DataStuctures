import java.util.*;
class HashSett
{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println("HashSet contains 'apple': " + set.contains("apple"));
        System.out.println("HashSet size: " + set.size());

        HashSet<String> otherSet = new HashSet<>();
        otherSet.add("banana");
        otherSet.add("grape");

        set.addAll(otherSet);

        System.out.println("HashSet after adding another set: " + set);

        set.remove("banana");
        System.out.println("HashSet after removing 'banana': " + set);

        set.clear();
        System.out.println("HashSet after clearing: " + set);

    }
}