/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        int cnt=0;
        Node temp=head;
        while(temp != null){
            if(temp.data==key)
            return true;
            temp=temp.next;
        }
        return false;
    }
}