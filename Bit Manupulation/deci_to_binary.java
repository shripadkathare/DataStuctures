public class deci_to_binary {
    public static void main(String[] args) {
        int n = 5;
        for(int i=31 ; i>=0; i--)
        {
            int x = (n>>i);
            if((x&1)!=0)
                System.out.println('1');
            else 
                System.out.println("0");
        }
    }
    
}