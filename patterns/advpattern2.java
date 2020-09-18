package patterns;

public class advpattern2 {
    public static void main(String[] args) {
        int n=4;
        int count=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<n-j;i++){
                System.out.print("  ");
            }
            for(int i=0;i<=j;i++){
                count++;
                System.out.print(count+"  ");
            }
            System.out.println();
        }
      
    }
    
}
