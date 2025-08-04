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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        ListNode temp2 = head;
        while (!stack.isEmpty()){
            temp2.val = stack.pop();
            temp2 = temp2.next;

        }
        return head;
    }
}
