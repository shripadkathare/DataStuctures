public class RotateMatrixAntiClockwiseBy90 {
    static void check(int arr[][] , int n)
    {
        int temp[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                temp[n-j-1][i] = arr[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                arr[i][j]=temp[i][j];
            }
        }
    }

    static void check2(int arr[][] , int n)
    {
        int temp [][] = new int[n][n];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                temp[i][j]=arr[j][i];
            }
        }
        int low =0 , high = n-1;
        for (int i = 0; i < temp.length; i++) {
            while(low<high)
            {
                int tempp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i]=tempp;
                high--;
                low++;
            }
        }
    }



    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        check(arr, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********************");
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n2 = 3;
        check(arr2, n2);
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
