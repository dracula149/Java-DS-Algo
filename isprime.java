import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        boolean prime=true;
        for(int i=2;i*i<n;i++){// under root of n can be implemented in code as i*i<n(code optimization)
            if(n%i==0){
                prime=false;
                break;
                
                
            }
        }
        if(n<2)prime=false;//condition for n=1
        System.out.println("isPrime "+prime);
    }
    
}
//proprety: if a no has a factor except 1 & n then we will definitely get it between 2 & underoot of n
//i<=under root of n =>i*i<n
