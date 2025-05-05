// import java.utli.*;

public class Practice {
    
   public void Name( int n){
if(n <=0) return;
System.out.println(n);

 Name(n -1);

 }


 public static void main(String[] args) {
    
    Practice m = new Practice();
    m.Name(5);
 }

}
