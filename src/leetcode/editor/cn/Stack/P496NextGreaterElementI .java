package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class P496NextGreaterElementI{
    public static void main(String[] args){
        Solution solution = new P496NextGreaterElementI().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums2){
            map.put(num, -1);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int j : nums2) {
            while (!stack.isEmpty() && stack.peek() < j) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }

        int n = nums1.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}