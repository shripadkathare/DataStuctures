public class LargestEvenOddSubArray {
    static int check(int arr[])
    {
        int n = arr.length;
        int res =0;
        for(int i=0;i<n;i++)
        {
            int count =1;
            for(int j =i+1;j<n;j++)
            {
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0))
                {
                    count++;
                }
                else
                    break;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    static int check2(int arr[])
    {
        int n = arr.length;
        int res =0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
            {
                count++;
                res = Math.max(res, count);
            }
            else    
                count=1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(check(arr));
        System.out.println(check2(arr));
    }
}
