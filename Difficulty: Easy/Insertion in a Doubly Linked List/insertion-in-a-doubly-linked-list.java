/* Structure of Doubly Linked List Node
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
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        
         Node newNode = new Node(x);

      
        if (head == null)
            return newNode;

        Node curr = head;

       
        while (p > 0 && curr.next != null) {
            curr = curr.next;
            p--;
        }

   
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }
}