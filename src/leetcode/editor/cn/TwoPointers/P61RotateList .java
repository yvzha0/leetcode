package leetcode.editor.cn.TwoPointers;

import leetcode.editor.cn.ListNode;

class P61RotateList{
    public static void main(String[] args){
        Solution solution = new P61RotateList().new Solution();
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
    public leetcode.editor.cn.ListNode rotateRight(leetcode.editor.cn.ListNode head, int k) {
        if(head == null){
            return head;
        }
        int n = len(head);
        k = k % n;
        if(k == 0){
            return head;
        }
        leetcode.editor.cn.ListNode cur = head;
        for(int i = 0; i < n - k - 1; i++){
            cur = cur.next;
        }
        leetcode.editor.cn.ListNode newHead = cur.next;
        cur.next = null;
        cur = newHead;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }

    private int len(leetcode.editor.cn.ListNode head){
        ListNode cur = head;
        int res = 0;
        while(cur != null){
            res++;
            cur = cur.next;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}