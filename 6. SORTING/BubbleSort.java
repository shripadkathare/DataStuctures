// Bubble Sort
class BubbleSort{
    static void sort(int arr[] , int n)
    {
        for(int i = 0 ; i<n-1 ;i++)
        {
            for(int j=0 ; j<n-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void sort2(int arr[] , int n)
    {
        for(int i = 0 ; i<n-1 ;i++)
        {
            for(int j=0 ; j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void sort3(int arr[] , int n)
    {
        boolean flag = false;
        for (int i = 0; i < n-1; i++) {
            for(int j= 0 ; j<n-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ; 
                    flag = true;
                }
                if(flag == false)
                {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] ={3,2,1};
        int arr2[] ={3,2,1};
        int arr3[] ={3,2,1};
        int n =arr1.length;
        sort(arr1, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        sort2(arr2, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        sort3(arr3, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}


