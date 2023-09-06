
class SelectionSort
{
    static void sort(int arr[] , int n)
    {
        int temp [] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            int min =0 ;   // minimum index
            for(int j=1; j<n ; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <n; i++) {
            System.out.println(temp[i]+" ");
            
        }
    }

    static void sort2(int arr[] , int n)
    {
        for (int i = 0; i < n; i++) {
            int min = i ;
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[min])
                {
                    min  = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,20,2,18};
        int arr2[] = {10,5,20,2,18};
        int n = arr.length;
        sort(arr, n);
        System.out.println();
        sort2(arr2, n);
    }
}