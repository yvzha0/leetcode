package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P456One32Pattern{
    public static void main(String[] args){
        Solution solution = new P456One32Pattern().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int second = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] < second){
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()){
                second = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}