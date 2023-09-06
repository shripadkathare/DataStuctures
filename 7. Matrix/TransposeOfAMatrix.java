// Write a program to find transpose of a matrix.

public class TransposeOfAMatrix {
    static void check(int arr[][] , int R , int C)
    {
        int temp[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[i][j]= arr[j][i];
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j]=temp[i][j];
            }
        }
    }

    static void check2(int arr[][] , int R , int C)
    {
        for (int i = 0; i < R; i++) {
            for (int j = i+1; j < C; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int R = 3;
        int C = 3;
        check(arr, R, C);
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println("*************************");
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int RR = 3;
        int CC= 3;
        check2(arr2, RR, CC);
        for (int i = 0; i < RR; i++) {
            for (int j = 0; j < CC; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
