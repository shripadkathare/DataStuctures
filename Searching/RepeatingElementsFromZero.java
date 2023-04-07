class RepeatingElementsFromZero{
    static int repeat(int arr[] , int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int repeat2(int arr[] , int n)
    {
        for(int i =1 ;i<n;i++)
        {
        if(arr[i]==arr[i-1])
            {
                return arr[i];
            }
        }
        return -1;
    }

    static int repeat3(int arr[], int n)
	{
		boolean visit[] = new boolean[n];

		for(int i = 0; i < n; i++)
		{
			if(visit[arr[i]])
				return arr[i];
			visit[arr[i]] = true;
		}

		return -1;
	}

    public static void main(String[] args) {
        int arr[] = {0,1,2,2,2,3};
        int n = arr.length;
        System.out.println(repeat(arr, n));
        System.out.println(repeat2(arr, n));
        System.out.println(repeat3(arr, n));
    }
}