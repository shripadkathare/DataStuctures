class KthSmallestElement
{
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[h];
        arr[h]=temp;
        return i;
    }
    
    static int kthSmallest(int arr[],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=partition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }

    public static void main (String[] args) 
    {
        int arr[] = new int[]{4,3,2,1};
        
        int n = arr.length;int k=3;
        int index=kthSmallest(arr,n,k);
        
        System.out.print(arr[index]);
        
    }
    
    
}
