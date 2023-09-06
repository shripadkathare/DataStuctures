import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    static int check1(String str)
    {
        for (int i = 0; i < str.length(); i++) 
        {
            for(int j=i+1 ; j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    static int check2(String str)
    {
        int temp[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            temp[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(temp[str.charAt(i)]>1)
            {
                return i;
            }
        }
        return -1;
    }

    static int check3(String str)
    {
        int temp[] = new int[256];
        Arrays.fill(temp , -1);
        int res = Integer.MAX_VALUE;
        for(int i=0 ;i<str.length();i++)
        {
            int f = temp[str.charAt(i)];
            if(f==-1)
            {
                temp[str.charAt(i)]=i;
            }
            else
            {
                res = Integer.min(res, f);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }

    static int check4(String str)
    {
        boolean temp[] = new boolean[256];
        int res = -1;
        for(int i = str.length()-1 ; i>=0 ;i--)
        {
            if(temp[str.charAt(i)])
            {
                res =i;
            }
            else
            {
                temp[str.charAt(i)]=true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "shrii";
        System.out.println(check1(s));
        System.out.println(check2(s));
        System.out.println(check3(s));
        System.out.println(check4(s));
    }
}
