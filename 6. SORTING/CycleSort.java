public class CycleSort {
    static void distinct(int arr[] , int n)
    {
        for(int cs = 0 ; cs <n-1 ; cs++ )
        {
            int item = arr[cs];
            int pos  = cs;
            for (int i = cs+1; i < n; i++) {
                if(arr[i]<item)
                {
                    pos++;
                }
            }
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while(pos != cs)
            {
                pos = cs;
                for (int i = cs+1; i < n; i++) {
                    if(arr[i]<item)
                    {
                        pos++;
                    }
                }
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,3,9,5,2,1};
        int n =arr.length;
        distinct(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
