public class LQuickSort {
    static void quick(int arr[] ,int  start ,int end)
    {
        if(start<end)
        {
            int p = partition(arr, start, end);
            quick(arr, start, p-1);
            quick(arr, p+1, end);
        }
    }
    static int partition(int arr[] , int start , int end)
    {
        int i = start;
        int pivot = arr[end];
        for (int j = start; j <=end; j++) {
            if(arr[j]<pivot)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
                i++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,4,7,3,2,9,6};
        int n = arr.length-1;
        quick(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
