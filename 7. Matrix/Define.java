// Program to define a matrix and print it

public class Define {
    static void print()
    {
        int arr[][]={{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
            } 
        }
    }
    static void print2()
    {
        int m=2 , n=2;
        int arr[][]= new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void print3()
    {
        int m=2 ;
        int arr[][]= new int[m][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
        System.out.println("********************");
        print2();  
        System.out.println("******************"); 
        print3();
    }
}
