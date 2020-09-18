package patterns;

public class advpattern3 {
    public static void main(String[] args) {
        int n=4;
        for(int j=0;j<n;j++){
            for(int i=0;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=0;j<n-1;j++){
            for(int i=1;i<n-j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
