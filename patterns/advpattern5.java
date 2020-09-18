package patterns;

public class advpattern5 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("* ");//first star
        for(int j=1;j<n-1;j++){
            System.out.print("* ");
            for(int i=0;i<=j-2;i++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
            }
            if(n>1){
                for(int i=0;i<n;i++) System.out.print("* ");//last star
    }

            }
            
    
}
