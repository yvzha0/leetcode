package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

class P1721SwappingNodesInALinkedList{
    public static void main(String[] args){
        Solution solution = new P1721SwappingNodesInALinkedList().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        for(int i = 1; i < k; i++){
            fast = fast.next;
        }
        ListNode first = fast;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}