public class RemoveDublicate {
    public static int check(int arr[])
    {
        int res =1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res-1]!=arr[i])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {11,22,22,33,33,44,44,44};
        System.out.println("before checking");
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int n=check(arr);
        System.out.println("after checking");
        for(int i=0 ; i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
