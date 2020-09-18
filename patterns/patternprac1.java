package patterns;

import java.util.Scanner;
import java.util.Scanner;
public class patternprac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int count=1;

       //code for top half
       for(int j=0;j<n/2;j++){
           for(int i=1;i<=(n/2)-j;i++){
               System.out.print("* ");
            }
             for(int i=0;i<count;i++){
                 System.out.print("  ");
             }
             for(int i=1;i<=(n/2)-j;i++){
                System.out.print("* ");
              }
              count=count+2;
              System.out.println();
            }

            System.out.println();


            //code for bottom half
            int ncount=count-2;//did this becouse count value increased by 2 more in last iteratio
       for(int j=0;j<n/2;j++){
           for(int i=0;i<=j;i++){
               System.out.print("* ");
           }
           for(int i=0;i<ncount;i++){
            System.out.print("  ");
           }
             ncount=ncount-2;
             for(int i=0;i<=j;i++){
                System.out.print("* ");
              }
              System.out.println();



       }
       
          

    }
    
}
