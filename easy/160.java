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
        int sizeA = 0;
        int sizeB = 0;
        ListNode travA = headA;
        ListNode travB = headB;
        while (travA != null){
            ++sizeA;
            travA = travA.next;
        }
        while (travB != null){
            ++sizeB;
            travB = travB.next;
        }
        int diff = Math.abs(sizeA - sizeB);
        travA = headA;
        travB = headB;

        if (sizeA < sizeB) {
            while (diff > 0){
                travB = travB.next;
                --diff;
            }
        } else {
            while (diff > 0){
                travA = travA.next;
                --diff;
            }
        }

        while (travA != null && travB != null){
            if (travA == travB){
                return travA;
            } else {
                travA = travA.next;
                travB = travB.next;
            }
        }
        return null;
    }
}
