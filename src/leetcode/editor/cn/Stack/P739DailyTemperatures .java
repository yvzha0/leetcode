package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P739DailyTemperatures{
    public static void main(String[] args){
        Solution solution = new P739DailyTemperatures().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int j = stack.pop();
                ans[j] = i - j;
            }
            stack.push(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}