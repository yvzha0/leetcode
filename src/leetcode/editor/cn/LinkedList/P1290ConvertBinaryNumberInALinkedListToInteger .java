package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

class P1290ConvertBinaryNumberInALinkedListToInteger{
    public static void main(String[] args){
        Solution solution = new P1290ConvertBinaryNumberInALinkedListToInteger().new Solution();
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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null){
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}