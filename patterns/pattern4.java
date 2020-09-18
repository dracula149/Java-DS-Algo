package patterns;

public class pattern4 {
public static void main(String[] args) {
    int n=9;
    for(int j=0;j<n;j++){
        for(int i=1;i<n-j;i++){
            System.out.print("  ");//double space
        }
        for(int i=0;i<=j;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    
}
