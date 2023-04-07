/*  
we check a power of 2 , suppose input 4 then we check it is
divisible by 2^n 

*/
public class power_of_two {
    static boolean check(int n)
    {
        if(n==0){
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
                return false;
            n=n/2;
        }
        return true;
    }

    static boolean check2(int n)        //efficient method using binary 
    {
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }

    static boolean check3(int n)
    {
        return (n&&((n&(n-1))==0));
    }
    public static void main(String[] args) {
       System.out.println(check(4));
       System.out.println(check2(4));
         
    }
}
