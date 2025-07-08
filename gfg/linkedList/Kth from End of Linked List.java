/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
      
      Node temp = head;
      Node kth = head;
      int count =0;
      
      while(temp!= null){
          temp = temp.next;
          count ++;
      }
      
      int res = (count-k )+1;
      
      if(count <k){
          return -1;
      }
      while(res>1){
          kth = kth.next;
          res--;
      }
        
      
        return kth.data; // brute force
    }
}


// optimal approach


    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
      
      Node fast = head;
      Node slow = head;
      
      
      for(int i = 0; i<k ; i++){
          if(fast == null) return -1;
          fast = fast.next;
          
      }
     
     while(fast != null){
         fast = fast.next;
         slow = slow.next;
     }
     
     
     return slow.data;
    }
}