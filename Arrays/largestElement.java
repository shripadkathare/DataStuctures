// To find largest element and index of given element
public class largestElement{
    public static void large(int arr[] , int n)
    {
        int flag =arr[0];
        int count=0;              // count is used to find index
        for(int i = 0 ; i<n ; ++i)
        {
            if(arr[i]>flag)
            {
                flag=arr[i];
                break;
            }
            count++;
        }
        System.out.println(flag);
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] arr = {10,3,6,13,11,12};
        int n =arr.length;
        large(arr,n);
    }
}