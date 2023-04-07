public class MaximumAppearingElement {
    static int element(int left[] , int right[] , int n)
    {
        int freq[] =new int[100];
        
        for(int i=0;i<n;i++)
        {
            for(int j=left[i];j<right[i];j++)
            {
                freq[j] +=1;
            }
        }
        int res=0;
        for (int j = 0; j < 100; j++) {
            if(freq[j]>freq[res])
            {
                res=j;
            }
        }
        return res;

    }

    static int element2(int left[],int right[],int n)
    {
        int freq[]=new int[100];
        for(int i =0 ; i<n ; i++)
        {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res =0 ;
        for(int i=1;i<100;i++)
        {
            freq[i]=freq[i-1]+freq[i];
            if(freq[i]>freq[res])
            {
                res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {

		int[] L = { 1, 4, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		System.out.println(element(L, R, n));
        System.out.println(element2(L, R, n));
    }
}
