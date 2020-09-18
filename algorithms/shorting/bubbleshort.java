package algorithms.shorting;
import java.util.Scanner;

public class bubbleshort {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean shorted=true;//optimization: if we do no swaps during first j iteration means array is alreday shorted
        
        for(int j=0;j<n-1;j++){
            for(int i=0;i<n-1-j;i++){//optimizatin: run this loop n-1-j instead of n-1 time, as after every iteration last element gets shorted
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    shorted=false;
                }
            }
            if(shorted) break;
        }
       for(int it:a){  //for each loop where it is var and a is array
           System.out.print(it+" ");
       }

    }
}
