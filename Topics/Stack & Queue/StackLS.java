public class StackLS {
    
    static class Node{
        int data;
        Node next;
     Node(int data){
        this.data = data;
        next = null;
     }
    }
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data) {
        Node newNode = new Node(data);
       if(isEmpty()){
         head = newNode;
         return;
       }  
       newNode.next = head;  
       head = newNode;
    }

    public static int pop() {
        if(isEmpty()){
            return -1;
        }
      int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek(){
         if(isEmpty()){
            return -1;
        }
        int top = head.data;
        return top;
    }

    public static void main(String[] args) {
        
        StackLS s = new StackLS();
        s.push(10);
        s.push(2);
        s.push(5);
        s.push(16);
        s.push(15);

        while(!isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
