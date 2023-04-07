public class Frequencies  // counting sorted element 
{
    static void check(int arr[],int n)
    {
        int count =1;
        int i=1;
        while(n>i)
        {
            while(n>i && arr[i]==arr[i-1])
            {
                i++;
                count++;
            }
            System.out.println(arr[i-1]+"->"+count);
            i++;
            count=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]+"->"+count);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n = arr.length;
        check(arr, n);
    }

}
