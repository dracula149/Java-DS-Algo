import java.util.Scanner;
public class switchoperator {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first no");
      int a=sc.nextInt();
      System.out.println("enter 2nd no");
      int b=sc.nextInt();
      System.out.println("enter operand");
      sc.nextLine();//if you are taking an integer or any other datatypes before string you should add this line before taking input
      char c=sc.nextLine().charAt(0);//for taking character input
      switch(c){
          case '+':
          System.out.println(a+b);
          break;
          case '-':
          System.out.println(a-b);
          break;
          default:
          System.out.println(a);

      }
}
}
