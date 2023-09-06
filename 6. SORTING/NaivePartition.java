public class NaivePartition {
    static void naive(int arr[] , int start, int end , int pivot)
    {
        int index =0;
        int temp[] = new int[end-start+1];
        for (int i = start; i <=end; i++) {
            if(arr[i]<=arr[pivot] )
            {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[pivot])
            {
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i = start; i <=end; i++) {
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,13,6,9,12,11,8};
        int start = 0 ;             //index
        int end = arr.length-1;
        int pivot = arr.length-1;               //index
        naive(arr, start, end, pivot);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
