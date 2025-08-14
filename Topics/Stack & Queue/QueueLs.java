public class QueueLs {

    static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
             next = null;  
        }
    }

        static Node head = null;
        static Node tail = null;
      
        public static boolean isEmpty(){
            return head == null && tail == null;

        }

        public static void add(int data){
            Node newNode = new Node(data);
           if(tail== null){
            tail=head=newNode;
            return;
           }
           tail.next = newNode;
           tail = newNode;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = head.data;
            if(head==tail){
                result = head.data;
                head = tail =null;
                return result;
            }
            head = head.next;
            return result;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
        
            return head.data;
        }
    

        public static void main(String[] args) {
            QueueLs q = new QueueLs();
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.remove();
            Node temp = head;
            while(temp!= null){
                System.out.println(temp.data);
                temp = temp.next; 
            }
            System.out.println(q.peek());
            
        }


    
}
