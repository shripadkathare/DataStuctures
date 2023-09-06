import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {
         String str = "[{()]";
         System.out.println(  balenced(str));
    }
    static boolean balenced (String str)
    {
      Deque <Character> D = new ArrayDeque<>();
       
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if( x== '[' || x == '{' || x == '(') 
            {
                D.push(x);
            }
            else{
                if(D.isEmpty()) return false;
                else if(matching(D.peek(), x) == false) return false;
                else D.pop(); 
            }
            
        }
        return (D.isEmpty() == true);
    }
    static boolean matching(char A , char B)
    {
        return ((A=='[' && B == ']') || 
                (A =='{' && B =='}') ||
                (A=='(' && B == ')'));
    }
}
