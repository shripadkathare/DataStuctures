public class TwoPointersApproach {
    static boolean naive(int arr[], int n , int x)
    {
        for(int i=0 ; i<n ;i++)
        {
            for(int j =i+1 ; j<n ; j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean efficient(int arr[] , int n , int x)
    {
        int left = 0 , right =n-1;
        while (left < right)
        {
            if(arr[left]+arr[right]== x)
            {
                return true;
            }
            else
            {
                if(arr[left]+arr[right] <x)
                {
                    left++;
                }
                else    
                    right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n= arr.length;
        int x =9;
        System.out.println(naive(arr, n, x));
        System.out.println(efficient(arr, n, x));
    }
}
