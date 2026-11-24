package leetcode.editor.cn.TwoPointers;

import leetcode.editor.cn.TwoPointers.ListNode;

class P86PartitionList{
    public static void main(String[] args){
        Solution solution = new P86PartitionList().new Solution();
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
    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode();
        ListNode preCur = pre;
        ListNode last = new ListNode();
        ListNode lastCur = last;
        ListNode cur = head;
        while(cur != null){
            if(cur.val < x){
                preCur.next = cur;
                preCur = cur;
            }else {
                lastCur.next = cur;
                lastCur = cur;
            }
            cur = cur.next;
        }
        preCur.next = last.next;
        lastCur.next = null;
        return pre.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}