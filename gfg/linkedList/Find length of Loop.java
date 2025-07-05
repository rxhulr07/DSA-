
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head ) {
        
        Map<Node,Integer> mp = new HashMap<>();
        
        Node temp = head;
        int index =1;
        
        while (temp != null){
            if(mp.containsKey(temp)){
              return index - mp.get(temp);
                
            }
            
            mp.put(temp, index);
            index++;
            temp = temp.next;
        }
        
       return 0;
    }
}