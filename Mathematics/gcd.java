public class gcd {
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,b%a);

    }
    public static void main(String[] args) {
        System.out.println(gcd(4,6));
    }
    
}
