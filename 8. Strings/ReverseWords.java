public class ReverseWords 
{
    static void reverse(char str[] , int left , int right)
    {
        while(left<=right)
        {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
    static void check(char str[] , int n)
    {
        int start = 0;
        for (int end = 0; end < str.length; end++) {
            if(str[end]==' ')
            {
                reverse(str, start, end-1);
                start = end+1;
            }
        }
        reverse(str, start, n-1);
        reverse(str,0,n-1);
    }
    public static void main(String[] args) {
        String s = "i love bengaluru";
        char ch[] = s.toCharArray();
        int n = s.length();
        check(ch, n);
        System.out.println(ch);
    }
}
