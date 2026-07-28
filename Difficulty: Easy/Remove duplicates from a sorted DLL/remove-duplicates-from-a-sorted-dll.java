/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        Node temp=head;
        while(temp!=null && temp.next!=null){
            Node nextnode=temp.next;
            
            while(nextnode!=null  && nextnode.data==temp.data){
                nextnode=nextnode.next;
            }
            
            temp.next=nextnode;
            if(nextnode!=null)
                nextnode.prev=temp;
            
            temp=temp.next;
        }
        return head;
    }
}