package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

class P725SplitLinkedListInParts{
    public static void main(String[] args){
        Solution solution = new P725SplitLinkedListInParts().new Solution();
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = len(head);
        int size = n / k;
        int more = n % k;
        ListNode[] ans = new ListNode[k];
        for(int i = 0; i < k; i++){
            ListNode cur = head;
            if(cur != null){
                ans[i] = cur;
            }else {
                break;
            }
            int m = size;
            if(more != 0){
                m++;
                more--;
            }
            for(int j = 0; j < m - 1; j++){
                cur = cur.next;
                head = head.next;
            }
            head = head.next;
            cur.next = null;
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