/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
       Node newNode = new Node(x);
       Node temp = head;
       int count=0;
       
       while(temp.next!= null){
           if(count == p) break;
           temp = temp.next;
           count++;
       }
       
       newNode.next = temp.next;
       newNode.prev = temp;
       
       if(temp.next!=null){
           temp.next.prev = newNode;
       }
       temp.next = newNode;
       
       
       return head;    }
    
    
}