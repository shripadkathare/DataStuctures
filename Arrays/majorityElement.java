//Majority element is an element that appears more than n/2 times in an array of size n.
public class majorityElement {
    static int major(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>(n/2))
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1};
        System.out.println(major(arr));
    }
    
}
