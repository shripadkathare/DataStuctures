public class deletion {
    public static int delet(int arr[] , int n , int x )
    {
        int i=0;
        for (i=0 ;i<n ; i++)
        {
            if(arr[i]==x)
            {
                break;
            }
        }
        if(i==n)  // it is an base case , where we traverse whole array and reach n
        {
            return n;
        }
        for(int j=i ; j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;

        int x =22;
        int n = arr.length;
        System.out.println("before deletion");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("after deletion");
        n=delet(arr, n, x);
        for(int i=0 ; i<n ;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    
}
