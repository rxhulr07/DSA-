// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Join {
    public static Node joinTheLists(Node head1, Node head2) {
        // your code here
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1.next!= null){
            temp1 = temp1.next;
        }
        
        temp1.next = temp2;
        
        return head1;
    }
}