public class SpiralTraversalOfMatrix {
    static void check(int arr[][] , int R , int C)   
    {
        int top = 0 , bottom = R-1 , left = 0 , right = C-1;
        while(top <= bottom && left <= right)
        {
            //to print top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;

            //to print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            //to print bottom row
            if(top <= bottom)
            {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            //to print left column
            if(left<= right)
            {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        check(arr, 4, 3);
    }
}
