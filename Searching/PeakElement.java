public class PeakElement {
    static int naive(int arr[] , int n )
    {
        if(n==1) return arr[0];
        if(arr[0]>= arr[1]) return arr[0];
        if(arr[n-1] >= arr[n-2]) return arr[n-1] ; 
        for(int i=1 ;i<n;i++)
        {
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }

    static int efficient(int arr[] , int n)
    {
        int left=0 , right=n-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if((mid==0 || arr[mid-1] <=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
            {
                return arr[mid];
            }
            if(mid>0 && arr[mid-1] >= arr[mid])
            {
                right =mid-1;
            }
            else
            {
                left = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        System.out.println(naive(arr, n));
        System.out.println(efficient(arr, n));
    }
}