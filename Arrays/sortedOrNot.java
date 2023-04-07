public class sortedOrNot {
    public static boolean naive(int arr[]){
        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={11,22,33};
        System.out.println("naive solution : "+naive(arr));
        System.out.println("efficient solution: "+check(arr));

    }
}
