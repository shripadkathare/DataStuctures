public class SubArray {
    static void subarray(int arr[] ,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i ;k<=j;k++){
                    System.out.println(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n =arr.length;
        subarray(arr, n);

    }
    
}
