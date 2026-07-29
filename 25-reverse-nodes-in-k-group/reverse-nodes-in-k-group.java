/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        ListNode reverselist(ListNode head){
            ListNode temp=head;
            ListNode prev=null;
            while(temp!=null){
                ListNode front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
            }
            return prev;
        }

        ListNode getkthnode(ListNode temp,int k){
            k-=1;
            while(temp!=null && k>0){
                k--;
                temp=temp.next;
            }
            return temp;
        }

    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode temp=head;
         ListNode prevlast=null;
         while(temp!=null){
            ListNode kthnode=getkthnode(temp,k);
            if(kthnode==null){
                if(prevlast!=null)
                prevlast.next=temp;
                break;
            }

             ListNode nextnode=kthnode.next;
             kthnode.next=null;
              reverselist(temp);
              if(temp==head){
                head=kthnode;
              }
              else{
                prevlast.next=kthnode;
              }   
              prevlast=temp;
              temp=nextnode;

         }
         return head;
    }
}