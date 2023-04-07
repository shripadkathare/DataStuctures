//rotate element d times at last on an array
public class leftRotateDTimes {
    public static void rotate(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void check(int arr[],int n,int d ){
        for(int i=1;i<=d;i++)
        {
            rotate(arr, n);
        }
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        int n = arr.length;
        int d=4;
        check(arr, n, d);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
