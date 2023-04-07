public class Search {

    public static int search(int arr[],int x)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44};
        int x=33;
        if(search(arr, x)!=-1)
        {
            System.out.println("found at :"+search(arr, x));
        }
        else
            System.out.println("not found");
    }

}
