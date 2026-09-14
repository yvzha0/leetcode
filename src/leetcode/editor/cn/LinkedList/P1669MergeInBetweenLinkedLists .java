package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

class P1669MergeInBetweenLinkedLists{
    public static void main(String[] args){
        Solution solution = new P1669MergeInBetweenLinkedLists().new Solution();
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0;
        ListNode cur = list1;
        while(i < a - 1){
            cur = cur.next;
            i++;
        }
        ListNode mid = cur.next;
        cur.next = list2;
        i++;
        while(list2.next != null){
            list2 = list2.next;
        }
        while(i <= b){
            mid = mid.next;
            i++;
        }
        list2.next = mid;
        return list1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}