public class CountInversionsInArray {
    static int count(int arr[])
    {
        int n = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    n++;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        System.out.println(count(arr));
    }
}
