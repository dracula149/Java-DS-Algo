import java.util.Scanner;
public class seriessum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        float res=0;
        for(float i=1;i<=n;i++){
            res +=1/i;
        }
        System.out.println(res);
    }
    
}
