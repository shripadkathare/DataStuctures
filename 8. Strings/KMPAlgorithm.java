public class KMPAlgorithm {
    static void check(String str , int lps[] )
    {
        int n = str.length();
        lps[0]=0;
        int j =0;
        int i =1;
        while(i<n)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                j++;
                lps[i]=j;
                i++;
            }
            else
            { 
                if(j==0)
                {
                    lps[i]=0;
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
        }
    }

    static void kmp(String txt , String pat)
    {
        int m = txt.length();
        int n = pat.length();
        int lps[] = new int[m];
        check(pat, lps);
        int i =0 , j=0;
        while(i<m)
        {
            if(txt.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
            }
            if(j==n)
            {
                System.out.print(i-j +" ");
                j = lps[j-1];
            }
            else if(i<m && txt.charAt(i)!=pat.charAt(j))
            {
                if(j==0)
                {
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
    }


    public static void main(String[] args) {
        String txt = "abcabc";
        String pat = "b";
        kmp(txt, pat);
    }
}
