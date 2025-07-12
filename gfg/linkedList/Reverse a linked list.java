// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        
     if(head == null && head.next == null) return head;
        Node temp = head;
        Node prev = null;
        
        while(temp!= null ){
        Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        Node newHead = prev;
        
        return newHead;
       
    }
}