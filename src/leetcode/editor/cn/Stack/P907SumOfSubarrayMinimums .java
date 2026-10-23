package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class P907SumOfSubarrayMinimums{
    public static void main(String[] args){
        Solution solution = new P907SumOfSubarrayMinimums().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nextMin = new int[n];
        int[] preMin = new int[n];
        Arrays.fill(nextMin, n);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                nextMin[stack.pop()] = i;
            }
            preMin[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int mod = 1000000007;
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans = (ans + (long) arr[i] * (nextMin[i] - i) * (i - preMin[i])) % mod;
        }
        return Math.toIntExact(ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}