public class TripletInASortedArray {
    
    static boolean ispair(int arr[] , int n , int x,int start)
    {
        int left = start , right =n-1;
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

    static boolean triple(int arr[] ,int n ,int x)
    {
        for(int i=0 ; i<n-2;i++)
        {
            if(ispair(arr, n, x-i, i+1))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n =arr.length;
        int x =25;
        System.out.println(triple(arr, n, x));
    }
}
