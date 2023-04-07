public class secoundLargest {
    public static void main(String[] args) {
        int arr[]={11,11,11};
    int L = arr[0]; //Largest
    int SL = arr[0];  // secound largest
    for(int i=1;i<arr.length;i++)
    {
      if(arr[i]>L)
      {
        SL=L;
        L=arr[i];
      }
      else if(arr[i]>SL && arr[i]!=L)
      {
        arr[i]=SL;
      }
    }
    System.out.println(SL);
    }

    
}
