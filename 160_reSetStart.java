/**
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
        int Asize = 0;
        int Bsize = 0;
        ListNode curA = headA;
        while(curA!=null){
            curA = curA.next;
            Asize++;
        }
        ListNode curB = headB;
        while(curB!=null){
            curB = curB.next;
            Bsize++;
        }
        int start;
        curA = headA;
        curB = headB;
        if(Asize>=Bsize){
            start = Asize - Bsize;
            while(start > 0){
                curA = curA.next;
                start--;
            }
        }else{
            start = Bsize - Asize;
            while(start > 0){
                curB = curB.next;
                start--;
            }
        }
        while(curA!=null && curB!=null){
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
