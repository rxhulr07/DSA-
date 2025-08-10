import java.util.ArrayList;

public class StackAL {

    static class Stack {
         static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }
        
        //pop
        public static int pop(){
           if( isEmpty()){
            return -1;
            }
            int top = list.size()-1;
             return list.remove(top);

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            int top = list.size()-1;
             return list.get(top);
        }

    }

    public static void main(String[] args) {


        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
       

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
