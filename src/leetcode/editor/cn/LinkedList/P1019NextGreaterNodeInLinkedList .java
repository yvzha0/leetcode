package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

class P1019NextGreaterNodeInLinkedList{
    public static void main(String[] args){
        Solution solution = new P1019NextGreaterNodeInLinkedList().new Solution();
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
    public int[] nextLargerNodes(ListNode head) {
        int n = len(head);
        int[] ans = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && head.val > stack.peek()[1]){
                ans[stack.pop()[0]] = head.val;
            }
            stack.push(new int[] {i, head.val});
            head = head.next;
        }
        return ans;
    }

    private int len(ListNode head){
        int res = 0;
        while(head != null){
            res++;
            head = head.next;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}