/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if (head == null) return null;

    Node curr = head;

    for (int i = 1; i < x && curr != null; i++) {
        curr = curr.next;
    }

    if (curr == null) return head;

    if (curr.prev != null)
        curr.prev.next = curr.next;
    else
        head = curr.next;

    if (curr.next != null)
        curr.next.prev = curr.prev;

    return head;
    }
}