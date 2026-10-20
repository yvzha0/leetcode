package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P1673FindTheMostCompetitiveSubsequence{
    public static void main(String[] args){
        Solution solution = new P1673FindTheMostCompetitiveSubsequence().new Solution();
        solution.mostCompetitive(new int[]{71,18,52,29,55,73,24,42,66,8,80,2}, 3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length;
        int[] nextSmall = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && nums[i] < nums[stack.peek()]){
                nextSmall[stack.pop()] = i;
            }
            stack.push(i);
        }
        int[] ans = new int[k];
        int i = 0;
        int j = 0;
        while(i < k){
            int next = nextSmall[j];
            while(next != 0 && n - next >= k - i){
                j = next;
                next = nextSmall[j];
            }
            ans[i++] = nums[j];
            j++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}