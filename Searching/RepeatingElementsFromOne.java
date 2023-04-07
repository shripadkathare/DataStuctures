public class RepeatingElementsFromOne {
    static int repeat(int arr[] , int n)
    {
        int slow = arr[0] , fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast )
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return arr[slow-1];

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3};
        int n = arr.length;
        System.out.println(repeat(arr, n));
    }
}
