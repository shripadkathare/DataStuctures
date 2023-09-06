public class LeftMostNonRepeating {
    static int check(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                return i;
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
            if(temp[str.charAt(i)]==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "sshri";
        System.out.println(check(s));
        System.out.println(check2(s));
    }
}
