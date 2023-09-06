public class SortAnArrayWithTwoTypesOfElements {
    static void check(int arr[],int n)
    {
        int temp[] = new int[n];
        int i=0;
        for (int j = 0; j < n; j++) {
            if(arr[j]<0)
            {
                temp[i]=arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[j]>=0)
            {
                temp[i]=arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            arr[j]=temp[j];
        }
    }

    static void check2(int arr[] , int n)
    {
        int i = -1;
        int j = arr.length;
        while(true)
        {
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>= 0);
            if(i>=j)
            {
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,0,5,-1,-5,10};
        int n = arr.length;
        check(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

        System.out.println();

        int arr2[] = new int[]{4,0,5,-1,-5,10};
        int n2 = arr2.length;
        check2(arr2, n2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
    }
}
}