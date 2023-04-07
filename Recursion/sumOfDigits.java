public class sumOfDigits {
    public static int count(int n)
    {
        if(n==0)
            return 0;
        return (n%10)+(count(n/10)) ;
    }
    public static int countt(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum =sum+(n%10); 
            n=n/10;
        } 
        return sum;
    }
    public static void main(String[] args) {
        int n = 453  ;
        System.out.println("Recursive solution : "+count(n));
        System.out.println("iteration solution : "+countt(n));

    }
}
