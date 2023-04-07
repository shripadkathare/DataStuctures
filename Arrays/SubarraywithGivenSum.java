public class SubarraywithGivenSum {
    static boolean sum(int arr[] , int n , int k)
    {
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j =i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    return true;
                }
            }

        }
        return false;
    }
    static boolean sum2(int arr[], int n , int k)
    {
        int count=0;
        int sum=0;
        for(int i =0 ; i<n;i++)
        {
            sum += arr[i];
            while(k<sum)
            {
                sum -=arr[count];
                count++;
            }
            if(sum==k)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 12;
        int n = arr.length;
        System.out.println(sum(arr, n, k));
        System.out.print(sum2(arr, n, k));
    }
    
}
