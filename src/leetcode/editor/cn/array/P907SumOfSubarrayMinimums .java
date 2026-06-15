package leetcode.editor.cn.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class P907SumOfSubarrayMinimums{
    public static void main(String[] args){
        Solution solution = new P907SumOfSubarrayMinimums().new Solution();
        solution.sumSubarrayMins(new int[]{3,1,2,4});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        long ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        stack.push(-1);
        for(int i = 0; i < n; i++){
            while (stack.size() > 1 && arr[stack.peek()] >= arr[i]){
                right[stack.pop()] = i;
            }
            left[i] = stack.peek();
            stack.push(i);
        }
        for(int i = 0; i < n; i++){
            ans += (long) arr[i] * (i - left[i]) * (right[i] - i);
        }
        return Math.toIntExact(ans % mod);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}