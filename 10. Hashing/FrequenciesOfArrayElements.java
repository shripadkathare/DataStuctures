import java.util.*;
public class FrequenciesOfArrayElements {
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        freq(arr);
        System.out.println("-----------------------------");        
        countFreq(arr, n);

    }

    static void freq(int arr[])
    {
        HashMap<Integer,Integer> h = new HashMap<>() ;
        for(int x : arr)
        {
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : h.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

     static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
              hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
              hmp.put(arr[i], 1);    
        }
    
       for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
        System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
