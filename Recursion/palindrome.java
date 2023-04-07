import java.lang.String.*;

public class palindrome {
    public static boolean check(String s, int start , int end )
    {
        if(start>=end)
            return true;
        return (s.charAt(start)==s.charAt(end)) && check(s, start+1, end-1);
    }

    public static void main(String[] args) {
        String s="shriirhs";
        int start =0;
        int end=s.length()-1;
        System.out.println(check(s, start, end));
    }
}
