package patterns;

public class advpattern1 {
    public static void main(String[] args) {
        int n=6;
        for(int j=0;j<n;j++){
            for(int i=1;i<n-j;i++){
                System.out.print("  ");
            }
            for(int i=0;i<=j;i++){
                System.out.print("*  " );
            }
            System.out.println();
        }
    }
}
