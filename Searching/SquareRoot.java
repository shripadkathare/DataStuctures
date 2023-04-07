//Given an integer, we need to find floor of its square root. This video talks about two methods.
class SquareRoot
{
    static int root(int x){
        int left =1 , right=x,res=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int smid=mid*mid;         // Square of mid
            if(smid==x)
            {
                return mid;
            }
            else if(smid<x)
            {
                left = mid+1;
                res=mid;
            }
            else 
            {
                right = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int x =6;
        System.out.println(root(x));
    }
}