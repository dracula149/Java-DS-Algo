import java.util.Scanner;
public class matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int a[][]= new int[row][col];
        int b[][]=new int[row][col];
        System.out.println("enter elements of first array");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of second array");


      

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }

        int c[][]=new int[row][col];

        System.out.println("the sum of two arrays are:");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(c[i][j]);
            }
        }



    }
}
