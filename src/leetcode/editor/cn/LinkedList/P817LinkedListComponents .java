package leetcode.editor.cn.LinkedList;

import leetcode.editor.cn.ListNode;

import java.util.HashSet;
import java.util.Set;

class P817LinkedListComponents{
    public static void main(String[] args){
        Solution solution = new P817LinkedListComponents().new Solution();
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode lNode = head;
        ListNode rNode = head;
        int ans = 0;
        while(rNode != null){
            if(set.contains(rNode.val)){
                rNode = rNode.next;
            }else {
                if(lNode != rNode){
                    ans++;
                }
                lNode = rNode = rNode.next;
            }
        }
        if(lNode != rNode){
            ans++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}