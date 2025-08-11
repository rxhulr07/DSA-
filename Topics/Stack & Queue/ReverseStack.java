import java.util.*;

public class ReverseStack {
    

    public static void ReverseStack( Stack <Integer> s){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int top = s.pop();
        ReverseStack( s);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(3);
        s.push(4);

        ReverseStack( 5, s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}

}
