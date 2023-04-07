public class CountOccurrencesInSorted {
    static int FirstOccurrenceinSorted(int arr[], int x, int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
    }
    
	static int LastOccurrenceInSorted(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;
	}

    static int count(int arr[],int n , int x)
    {
        int first=FirstOccurrenceinSorted(arr, x, n);
        if(first==-1)
        {
            return 0;
        }
        else
            return(LastOccurrenceInSorted(arr, n, x)-first+1);
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1,1,1,1,1}, n=arr.length;

		int x = 1;
        int left =0 , right=n-1;
        FirstOccurrenceinSorted(arr, n, x);
        LastOccurrenceInSorted(arr, n, x);
        System.out.println(count(arr, n, x));
    }
}
