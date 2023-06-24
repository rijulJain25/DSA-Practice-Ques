/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> stk = new Stack<>();
        Node curr =  head;
        if(curr==null)
            return null;
        while(curr.next !=null  || curr.child!=null)
        {
            while(curr.child==null)
            {
                if(curr.next ==null)
                    break;
               curr= curr.next; 
            }
            if(curr.next!=null)
            {
                curr.next.prev = null;
                stk.add(curr.next);
                curr.next = null;
            }
            if(curr.child!=null)
            {
                Node temp = curr.child;
             temp.prev = curr;
             curr.child = null;
            curr.next = temp;
             curr = temp;
            }
        }
       while(!stk.isEmpty()) 
       {
           Node rem =  stk.pop();
           rem.prev = curr;
           curr.next = rem;
           while(curr.next!=null)
           {
               curr = curr.next;
           }
       }
        return head; 
    }
}