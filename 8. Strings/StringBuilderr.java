// Program to demonstrate StringBuilder class methods
public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert
        sb.insert(5, " beautiful");
        System.out.println("After insert: " + sb);

        // delete
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);

        // reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // replace
        sb.replace(5, 9, "WORLD");
        System.out.println("After replace: " + sb);

        // capacity
        System.out.println("Capacity: " + sb.capacity());

        // length
        System.out.println("Length: " + sb.length());

        // charAt
        System.out.println("Char at index 2: " + sb.charAt(2));

        // indexOf
        System.out.println("Index of 'W': " + sb.indexOf("W"));
    }
}
