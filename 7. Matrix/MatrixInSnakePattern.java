public class MatrixInSnakePattern {
    static void check(int arr[][],int R , int C)
    {
        for (int i = 0; i <R; i++) {
            if(i%2==0)
            {
                for (int j = 0; j < C; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for (int j = C-1; j>=0; j--) {
                    System.out.print(arr[i][j]+" "); 
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        int R = 2;
        int C =3;
        check(arr, R, C);;
    }
}
