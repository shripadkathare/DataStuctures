import java.lang.Thread.State;

public class Leader {
    public static void Leader(int arr[],int n)   //approch --> 1
    {
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag= true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void LeaderTwo(int arr[],int n)     // approch --> 2
    {
        int lead = arr[n-1];
        System.out.print(lead +" ");
        for(int i=n-2;i>=0;i--)
        {
            if(lead<arr[i])
            {
                lead = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
       
    }

    public static void main(String[] args) {
        int arr[]={7, 10, 4, 10, 6, 5, 2};
        int arrr[]={7, 10, 4, 10, 6, 5, 2};
        int n=arr.length;
        int nn=arrr.length;
        Leader(arr, n);
        System.out.println();
        System.out.println("------------");
        LeaderTwo(arrr, nn);
    }
}
