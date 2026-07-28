/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                // if this is the head of LL
                //then postdeletion the head will be updated
                
                if(temp==head){
                    head=temp.next;
                    
                }
                Node nextnode=temp.next;
                Node prevnode=temp.prev;
                
                if(nextnode!=null)
                nextnode.prev=prevnode;
                
                if(prevnode!=null)
                prevnode.next=nextnode;
                
                temp=nextnode;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}