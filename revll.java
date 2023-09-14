public class revll {
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
    public ListNode reverseList(ListNode head){
        ListNode prev;
        ListNode curr;
        if(head ==null ||head.next==null)
        {
            return null;
        }
        else{
        prev=head;
        curr=head.next;
        while(curr!= null)
        {
            ListNode next= curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;

        }
        head.next=null;
        head= prev;
        }
        return head;
    }
}
    

