import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int al[]={12,12,12,13,13,13,14};
        System.out.println(check(al, al.length));

        Integer all[]={12,12,12,13,13,13,14};
        System.out.println(same(all));
    }

    static int check(int arr[],int n)
    {
        HashSet <Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        return h.size();

    }
    static int same(Integer arr[])
    {
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
    }
}
