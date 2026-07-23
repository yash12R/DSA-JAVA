/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node prev=head;
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            Node temp=new Node(arr[i]);
            temp.prev=prev;
            prev.next=temp;
            
            prev=temp;
        }
        return head;
    }
}