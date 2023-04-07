import java.lang.annotation.Retention;

import javax.swing.text.html.StyleSheet;

public class LCM {
    public static int lcm(int a , int b)

    {
        int res =Math.max(a, b);
        while(true)
        {
            if(res%a==0 && res%b==0)
            {
                return res;
            }
            res++;
        }

    }

    //efficient solution -> use formula => a*b=gcd(a,b)*lcm(a,b)
    public static int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;

        }
        return gcd(b,a%b);

    }
    public static int lcmm(int a ,int b)
    {
        return (a*b)/gcd(a,b);
    }
    

    public static void main(String[] args) {
        System.out.println(lcm(4,6));
       
        System.out.println(lcmm(4,6));

    }
    
}
