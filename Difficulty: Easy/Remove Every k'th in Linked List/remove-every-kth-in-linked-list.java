/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if(head==null)
        return null;
        if(k==1){
        Node temp=head;
        head=head.next;
        return head;
        }
        
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
        cnt++;
        if(cnt==k){
            prev.next=temp.next;
            temp=prev.next;
            cnt=0;
        }
       else{
           prev=temp;
           temp=temp.next;
       }
      }
      return head;
    }
}