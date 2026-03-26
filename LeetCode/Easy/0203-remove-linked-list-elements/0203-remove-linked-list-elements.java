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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        TreeNode h = head;
        TreeNode p = head;
        while(h!=null){
            p=h;
            h=h.next;
            if(h.val==val){
                p.next=h.next;
            }
        }
        return p;
    }
}