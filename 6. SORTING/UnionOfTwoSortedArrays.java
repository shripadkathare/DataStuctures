import java.util.Arrays;

class UnionOfTwoSortedArrays{
    static void union(int arr1[] , int arr2[] , int n1 , int n2 )
    {
        int arr[] = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr[n1+i] = arr2[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i==0 || arr[i]!=arr[i-1])
            {
                System.out.println(arr[i] + " ");
            }
        }
    }

    static void union2(int arr1[] , int arr2[]  , int n1 ,int n2 )
    {
        int i = 0 , j=0 ;
        while(i<n1 && j<n2)
        {
            if(i>0 && arr1[i]==arr1[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1])
            {
                j++;
                continue;
            }
            if(arr1[i] < arr2[j])
            {
                System.out.print(arr1[i] + " ");
                i++;
            }
            if(arr1[i] > arr2[j])
            {
                System.out.print(arr2[j] + " ");
            }
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            while(i<n1)
            {
                System.out.print(arr1[i]+" ");
                i++;
            }
            while(j<n2)
            {
                System.out.print(arr2[j] + " ");
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        int n1 = arr1.length;
        int n2=arr2.length;
        union(arr1, arr2, n1, n2);
        System.out.println();
        union2(arr1, arr2, n1, n2);
    }
}