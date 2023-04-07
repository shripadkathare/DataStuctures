//Given a fixed array and multiple range sum, how to answer the queries efficiently
public class prefixSum {
    static int sum(int arrr[] ,int left , int right )
    {
        if(left==0)
        {
            return arrr[right];
        }
        return arrr[right]-arrr[left-1];
    }
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        int n =arr.length;
        int arrr[]=new int[n];
        arrr[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            arrr[i]=arrr[i-1]+arr[i];
        }
        System.out.println(sum(arrr, 1, 3));
    }
    
}
