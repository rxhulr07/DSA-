package Practice;
import java.util.*;

public class PushAtbottom {

    public static void PushatBottom(int value , Stack <Integer> s){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        PushatBottom(value , s);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(3);
        s.push(4);

        PushatBottom( 5, s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
