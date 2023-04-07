class SearchinSortedRotatedArray{
    static int search(int arr[] , int n , int x)
    {
       int left=0 ,right = n-1;
       while(left<=right)
       {
            int mid = (left+right)/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            if(arr[left] <arr[mid])  //from left index to right index
            {
                if(x >=arr[left] && x< arr[mid])
                    right = mid-1;
                else   
                    left =mid+1;
            }  
            else
            {
                if(x > arr[mid] && x <= arr[right])
                {
                    left = mid+1;
                }
                else    
                    right = mid-1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int n = arr.length;
        int x =2;
        System.out.println(search(arr, n, x));
    }
}