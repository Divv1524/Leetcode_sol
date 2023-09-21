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
    public ListNode reverse(ListNode head)
    {
        ListNode prev= null;
        ListNode curr= head;
        while(curr!= null)
        {
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast= fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null)
        {
        return true;
        }
        ListNode middle= findMiddle(head);
        ListNode shs= reverse(middle.next);
        ListNode fhs= head;
        while(shs!= null)
        {
            if(fhs.val!=shs.val)
            {
            return false;
            }
        fhs=fhs.next;
        shs=shs.next;    
    }
    return true;
    }
}


    

 
        