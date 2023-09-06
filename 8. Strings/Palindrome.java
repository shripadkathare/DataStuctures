public class Palindrome {
    static boolean check1(String str)
    {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());

    }

    static boolean check2(String str)
    {
        int left =0 ; 
        int right = str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true ;

    }

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(check1(str));;
        System.out.println(check2(str));
        
    }
}
