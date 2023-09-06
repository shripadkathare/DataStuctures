import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,2};
        print(arr1, arr2);
    }
    static void print(int arr1[] , int arr2[])
    {
        HashSet<Integer> H = new HashSet<>();
        for(int x: arr1)
        {
            H.add(x);
        }
        for(int x : arr2)
        {
            if(H.contains(x))
            {
                System.out.println(x);
            }
        }
    }
}
