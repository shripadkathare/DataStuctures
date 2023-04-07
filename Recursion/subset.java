public class subset {
    public static void set(String s,String curr , int i)
    {
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        set(s, curr, i+1);
        set(s, curr+s.charAt(i), i+1);
        
    }
    public static void main(String[] args) {
        String curr = "";
        int i=0;
        String s ="abc";
        set(s, curr, i);
    }
}
