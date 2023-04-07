import java.util.*;
import java.io.*;
import java.lang.*;

public class maxDiffOrder {
    static int maxx(int arr[],int n)   //naive solutiion
    {
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               // res=Math.max(res, arr[j]-arr[i]);
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    static int effiecient(int arr[],int n)
    {
        int res =0; 
        int minval = arr[0];
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,arr[i]-minval);
            minval=Math.min(minval, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 10, 6, 4, 8, 1};
        int n =arr.length;
        System.out.println(maxx(arr, n));
        System.out.println(effiecient(arr, n));
    }
}
