import java.util.Scanner;

public class prime_Factoial {
    public static boolean prime(int n){

    
    // for (int i = 2; i <= Math.sqrt(n); i += 2) {
    if (n % 2 == 0)
        return false;
    
    return true;
}
    public static void primea(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(prime(i))
            {
                int x=i;
                while(n%i==0)
                {
                    System.out.print(i);
                    x=x*i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
        primea(n);

    }

    
}