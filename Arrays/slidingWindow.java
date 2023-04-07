public class slidingWindow {
    static int window(int arr[],int n,int k){
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i+k-1<n;i++)
        {
            int sum=0;
            for(int j=0;j<k;j++)
            {
                sum=sum+arr[i+j];
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    static int window2(int arr[] , int n , int k)
    {
        int res =0;
        int sum = 0;
        for(int i=0 ; i<k ; i++)
        {
            sum +=arr[i];   
        }
        res = sum;
        for(int i=k ;i<n;i++)
        {
            sum += arr[i]-arr[i-k];
            res = Math.max(sum, res);
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        int n = arr.length;
        System.out.println(window(arr, n, k));
        System.out.println(window2(arr, n, k));
    }
}
