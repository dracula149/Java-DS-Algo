
class ternaryoperator{
 public static void main(String[] args) {
     int a=7;
     int b=6;
     int c=8;
     int result=0;
     result=a>b?a>c?a:c:b;
     //equivalent to => if(a>b){
        //      if(a>c){
        //          result=a;
        //      }
        //      else{
        //          result=c;
        //      }
        //  }
        //  else{
        //      result=b;
        //  }
 System.out.println(result);
        
    }
}