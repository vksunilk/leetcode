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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result=null;
        result=dummy;
        int carry=0;
        while (l1 !=null || l2!=null) {
            int n1=l1==null?0:l1.val;
            int n2=l2==null?0:l2.val;
            int sum = n1+n2+carry;
            carry=sum/10;
            result.next= new ListNode(sum%10);
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
            result=result.next;
            
        }
        if (carry>0) result.next= new ListNode(carry);
        return dummy.next;
    }
}