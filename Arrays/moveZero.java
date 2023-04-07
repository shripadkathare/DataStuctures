
public class moveZero { //move all zeros to end
    public static int naive(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]!=0)
                    {
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        count++;
                    }

                }
            }
        }
        return count;
    }


    public static int efficient(int arrr[])
    {
        int count=0;
        for(int i=0;i<arrr.length;i++)
        {
            if(arrr[i]!=0)
            {
                int temp = arrr[count];
                arrr[count]=arrr[i];
                arrr[i]=temp;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,0,3,0,9};
        int arrr[]={1,0,3,0,9};
        naive(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("----------------------------------");
        efficient(arrr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arrr[i]+" ");
        }

    }
    
}
