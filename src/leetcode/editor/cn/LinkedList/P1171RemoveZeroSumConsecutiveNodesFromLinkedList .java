package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

import java.util.HashMap;
import java.util.Map;

class P1171RemoveZeroSumConsecutiveNodesFromLinkedList{
    public static void main(String[] args){
        Solution solution = new P1171RemoveZeroSumConsecutiveNodesFromLinkedList().new Solution();
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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for(ListNode cur = preHead; cur != null; cur = cur.next){
            sum += cur.val;
            map.put(sum, cur);
        }
        sum = 0;
        for(ListNode cur = preHead; cur != null; cur = cur.next){
            sum += cur.val;
            cur.next = map.get(sum).next;
        }
        return preHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}