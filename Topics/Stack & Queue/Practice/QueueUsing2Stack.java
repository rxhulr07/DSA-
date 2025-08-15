

import java.util.Stack;

public class QueueUsing2Stack {

    static class Queue {

     static Stack <Integer>s =new Stack<>();
     static Stack <Integer>s1 =new Stack<>();

    public static boolean isEmpty(){
        return s.empty();
    }  

    public static void push(int data){
        while(!s.isEmpty()){
            s1.push(s.pop());
        }

        s.push(data);

        while(!s1.isEmpty()){
            s.push(s1.pop());
        }

    }
      public int pop() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s.peek();
        }


    }
        public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());  
        System.out.println(q.peek()); 
        System.out.println(q.pop());  
    }
}


