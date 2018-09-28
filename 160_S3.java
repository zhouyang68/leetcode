/**
 * Take 2ms
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int meetNull = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while(meetNull != 2||(curA!=null && curB!=null)){
            if(curA == null){
                meetNull++;
                curA = headB;
            }
            if(curB == null){
                meetNull++;
                curB = headA;
            }
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
