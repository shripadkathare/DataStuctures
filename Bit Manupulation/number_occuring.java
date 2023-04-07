/*  it checks the no. of occurance number 
    consider {2,3,3,2,2} , so the output will be odd no. of occurance
    output will be 2
*/
public class number_occuring {
    public static int count(int arr[] , int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0 ;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2!=0)
                return arr[i];
        }
        return 0; 
    }

    public static  void count2(int arr[] , int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0 ;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2!=0)
                System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3,5,3,2,3,3,2,2};
        int n =arr.length;
        System.out.println(count(arr, n));
        System.out.println("-------------------");
        count2(arr,n);

    }
    
}
