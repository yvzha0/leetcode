package leetcode.editor.cn.TwoPointers;

import leetcode.editor.cn.ListNode;

class P234PalindromeLinkedList{
    public static void main(String[] args){
        Solution solution = new P234PalindromeLinkedList().new Solution();
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
    public boolean isPalindrome(ListNode head) {
        int n = len(head);
        int i = 0;
        ListNode pre = null;
        ListNode cur = head;
        while(i < n / 2){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            i++;
        }
        ListNode left = pre;
        ListNode right;
        if(n % 2 == 0){
            right = cur;
        }else {
            right = cur.next;
        }
        while(left != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    private int len(ListNode head){
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