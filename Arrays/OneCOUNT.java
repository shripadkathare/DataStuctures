public class OneCOUNT {
    static int count(int arr[])
    {
        int n = arr.length;
        int result =0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j =i;j<n;j++)
            {
                if(arr[j]==1)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            result = Math.max(result, count);
        }
        return result;
    }

    static int count2(int arr[])
    {
        int n = arr.length;
        int result = 0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]==0)
            {
                count=0;
            }
            else{
                count++;
                result=Math.max(result,count);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,0,0,0,1,1,1,1,1,1,1};
        System.out.println(count(arr));
        System.out.println(count2(arr));
    }
}
