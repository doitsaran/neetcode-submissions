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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode curr = head;

        while(curr != null){

            if(set.contains(curr))
            {
                return true;
            }
            set.add(curr);
            ListNode temp = curr.next;
            curr = temp;
        }
        return false;

    }
}
