package algorithms.shorting;
import java.util.Scanner;

public class Selectionshort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int j=0;j<n-1;j++){
            int minIndex=j;
            for(int i=j;i<n;i++){
                if(a[i]<a[minIndex]){
                    minIndex=i;
                }
                
            }
            int temp=a[j];
            a[j]=a[minIndex];
            a[minIndex]=temp;
        }
        for(int it:a){
            System.out.print(it+" ");
        }
    }
}
