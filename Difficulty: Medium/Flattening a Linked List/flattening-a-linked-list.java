/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/

class Solution {
    public Node flatten(Node root) {
        if (root == null) return null;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        Node temp = root;
        while (temp != null) {
            pq.offer(temp);
            temp = temp.next;
        }

        Node dummy = new Node(-1);
        Node curr = dummy;

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            curr.bottom = node;
            curr = curr.bottom;
            curr.next = null;

            if (node.bottom != null)
                pq.offer(node.bottom);
        }

        return dummy.bottom;
    }
}