public class NaivePatternSearching {
    static void check(String A , String B)
    {
        int a = A.length();
        int b = B.length();
        
        for (int i = 0; i <= (a-b); i++) {
            int j=0;
            for(j=0 ; j<b ; j++)
            {
                if(B.charAt(j) != A.charAt(i+j))
                {
                    break;
                }
            }
            if(j==b)
            {
                System.out.print(i + " ");
            }
        } 
    }
    public static void main(String[] args) {
        String A = "AAAA";
        String B = "A";
        check(A, B);
    }
}
