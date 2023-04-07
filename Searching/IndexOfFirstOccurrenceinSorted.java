public class IndexOfFirstOccurrenceinSorted {
    static int recursive(int arr[],int n ,int x, int left,int right)
    {
        if(left>right)
        {
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid]<x)
        {
            return recursive(arr, n, x,mid+1, right);
        }
        else if(arr[mid]>x)
        {
            return recursive(arr, n, x, left, mid-1);
        }
        else
        {
            if(mid == 0 || arr[mid-1] != arr[mid] )
            {
                return mid;
            }
            else
            {
                return recursive(arr, n, x, left, mid-1);
            }
        }
    }


	static int iterative(int arr[], int x, int n)
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

    public static void main(String[] args) {
        int arr[] = {0,2,2,2,2};
        int n = arr.length;
        int x =2;
        int left =0;
        int right =n-1;
        System.out.println(recursive(arr, n, x, left, right));
        System.out.println(iterative(arr, x, n));
    }
}
