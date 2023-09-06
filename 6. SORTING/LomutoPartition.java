class LomutoPartition
{
    static void lomuto(int arr[] , int start , int end )
    {
        int pivot = arr[end];
        int i = start;
        for (int j = start; j <= end-1; j++) {
            if(arr[j]<pivot)
            {
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end]=temp;
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int arr[] = {9,5,3,34,2};
        int n = arr.length;
        lomuto(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}