import java.util.Arrays;

public class StringCheatSheet {
    public static void main(String[] args) {
        // String Creation and Initialization
        String s1 = "Hello, World!";
        String s2 = new String("Java is fun!");

        // String Length
        int len1 = s1.length();
        int len2 = s2.length();
       System.out.println(len1);
       System.out.println(len2);

        // Concatenation
        String concatStr = s1 + " " + s2;

        // Substring
        String subStr1 = s1.substring(0, 5);
        String subStr2 = s2.substring(5);

        // Character Extraction
        char ch1 = s1.charAt(4);

        // String Comparison
        boolean isEqual = s1.equals(s2);
        boolean isCaseInsEqual = s1.equalsIgnoreCase("HELLO, WORLD!");

        // String Searching
        boolean contains1 = s1.contains("Hello");
        boolean contains2 = s2.contains("hello");

        // String Splitting
        String[] splitStr = s2.split(" ");

        // String Conversion
        int num = 123;
        String numStr = String.valueOf(num);

        // String Modification
        String modStr = s1.replace("World", "Universe");

        // String Case Conversion
        String upperCaseStr = s1.toUpperCase();
        String lowerCaseStr = s2.toLowerCase();

        // String Trimming
        String withSpaces = "   Trim me!   ";
        String trimmedStr = withSpaces.trim();

        // String Empty Check
        boolean isEmpty1 = s1.isEmpty();
        boolean isEmpty2 = "".isEmpty();

        // String Building
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" is");
        sb.append(" awesome!");
        String builtStr = sb.toString();

        // String Formatting
        String formattedStr = String.format("The value of pi is approximately %.2f", Math.PI);

        // String Escape Sequences
        String escapeSeq = "Line 1\nLine 2\tTabbed Line\tNew \\ Line";

        // String Searching (indexOf)
        int idx1 = s1.indexOf('o');
        int idx2 = s1.indexOf("World");

        // Print the results
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Concatenated String: " + concatStr);
        System.out.println("SubString1: " + subStr1);
        System.out.println("SubString2: " + subStr2);
        System.out.println("Character at index 4 in s1: " + ch1);
        System.out.println("s1 is equal to s2: " + isEqual);
        System.out.println("s1 is equal to 'HELLO, WORLD!': " + isCaseInsEqual);
        System.out.println("s1 contains 'Hello': " + contains1);
        System.out.println("s2 contains 'hello': " + contains2);
        System.out.println("Split String: " + Arrays.toString(splitStr));
        System.out.println("numStr: " + numStr);
        System.out.println("Modified String: " + modStr);
        System.out.println("s1 in upper case: " + upperCaseStr);
        System.out.println("s2 in lower case: " + lowerCaseStr);
        System.out.println("Trimmed String: " + trimmedStr);
        System.out.println("isEmpty1: " + isEmpty1);
        System.out.println("isEmpty2: " + isEmpty2);
        System.out.println("Built String: " + builtStr);
        System.out.println("Formatted String: " + formattedStr);
        System.out.println("Escape Sequence: " + escapeSeq);
        System.out.println("Index of 'o' in s1: " + idx1);
        System.out.println("Index of 'World' in s1: " + idx2);
    }
}
