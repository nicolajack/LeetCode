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
    public ListNode middleNode(ListNode head) {
        int numNodes = 0;
        ListNode copy = head;
        while (copy.next != null) {
            ++numNodes;
            copy = copy.next;
        }
        double middle = Math.round(numNodes/2.0);
        for (int i=0; i < middle; i++){
            head = head.next;
        }
        return head;
    }
}
