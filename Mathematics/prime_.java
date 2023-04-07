
public class prime_
{
    static boolean prime(int n )
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static void isPrime(int n)
    {
        if(prime(11))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }


    

    public static void main(String[] args) {
        isPrime(11);
      
    }
}
