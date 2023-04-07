public class leftRotate {                 // roatating first element to last 
    public static void rotate(int arr[])
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44};
        rotate(arr);
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
