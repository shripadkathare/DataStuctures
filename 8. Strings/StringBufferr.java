public class StringBufferr {
        public static void main(String[] args) {
            // Creating a StringBuffer object
            StringBuffer sb = new StringBuffer("Hello");
    
            // Append method
            sb.append(" World");
            System.out.println("After appending: " + sb);
    
            // Insert method
            sb.insert(5, ", ");
            System.out.println("After inserting: " + sb);
    
            // Replace method
            sb.replace(0, 5, "Hi");
            System.out.println("After replacing: " + sb);
    
            // Delete method
            sb.delete(0, 3);
            System.out.println("After deleting: " + sb);
    
            // Reverse method
            sb.reverse();
            System.out.println("After reversing: " + sb);
    
            // Capacity method
            System.out.println("Capacity of StringBuffer: " + sb.capacity());
    
            // Length method
            System.out.println("Length of StringBuffer: " + sb.length());
    
            // SetLength method
            sb.setLength(5);
            System.out.println("After setting length: " + sb);
    
            // GetChars method
            char[] arr = new char[5];
            sb.getChars(0, 5, arr, 0);
            System.out.println("Characters in array: " + String.valueOf(arr));
    
            // EnsureCapacity method
            sb.ensureCapacity(20);
    
            // TrimToSize method
            sb.trimToSize();
            System.out.println("After trimming capacity: " + sb);
        }
    }

