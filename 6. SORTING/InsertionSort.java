public class InsertionSort {
    static void insert(int arr[] )
    {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,7,2};
        insert(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
