package leetcode.editor.cn.Stack;

import java.util.*;

class P503NextGreaterElementIi{
    public static void main(String[] args){
        Solution solution = new P503NextGreaterElementIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                ans[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        for(int i = 0; i < n && !stack.isEmpty(); i++){
            if(nums[stack.peek()] == max){
                break;
            }
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                ans[stack.pop()] = nums[i];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}