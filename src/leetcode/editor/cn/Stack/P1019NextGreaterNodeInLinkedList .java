package leetcode.editor.cn.Stack;

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
    class Pair{
        int idx;
        int val;

        public Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }

    public int[] nextLargerNodes(ListNode head) {
        Deque<Pair> stack = new ArrayDeque<>();
        int i = 0;
        int n = len(head);
        int[] ans = new int[n];
        while(head != null){
            int val = head.val;
            while(!stack.isEmpty() && val > stack.peek().val){
                Pair pair = stack.pop();
                ans[pair.idx] = val;
            }
            stack.push(new Pair(i++, val));
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