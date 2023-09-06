public class ImprovedNaivePatternSearchingForDistinct {
    static void check(String str , String pat )
    {
        int A = str.length();
        int B = pat.length();
        for (int i = 0; i <= (A-B); ) {
            int  j ; 
            for (j = 0; j < B; j++) {
                if(str.charAt(i+j) != pat.charAt(j))
                {
                    break;
                }
            }
            if(j==B)
            {
                System.out.println(i+"  ");
            }
            if(j==0)
            {
                i++;
            }
            else
            {
                i = i+j;
            }
        }
        
       
    }
    public static void main(String[] args) {
        String str = "shriri";
        String pat = "ri";
        check(str, pat);
    }
}
