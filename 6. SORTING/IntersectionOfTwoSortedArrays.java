
public class IntersectionOfTwoSortedArrays {
    static void sorted(int arr1[] , int arr2[], int n1 , int n2)
    {
        for (int i = 0; i < n1; i++) {
            if(i>0 && arr1[i-1]==arr1[i])
            {
                continue;
            }
            for(int j=0 ; j<n2 ; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]+ "");
                }
            }
            
        }

    }

    static void sorted2(int arr1[] , int arr2[] , int n1 , int n2)
    {
        int i=0 , j=0;
        while(i<n1 && j<n2)
        {
            if(i>0 && arr1[i]==arr1[i-1])
            {
                i++;
                continue;
            }
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            if(arr1[i]>arr2[j])
            {
                j++;
            }
            else
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            
        }
    }

    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4};
        int arr2[]={3,4,5};
        int n1 =arr1.length;
        int n2 = arr2.length;
        sorted(arr1, arr2, n1, n2);
        System.out.println();
        sorted2(arr1, arr2, n1, n2);
    }
}
