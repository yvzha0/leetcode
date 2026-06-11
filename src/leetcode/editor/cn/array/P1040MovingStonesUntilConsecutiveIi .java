package leetcode.editor.cn.array;

import java.util.Arrays;

class P1040MovingStonesUntilConsecutiveIi{
    public static void main(String[] args){
        Solution solution = new P1040MovingStonesUntilConsecutiveIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] numMovesStonesII(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        if(stones[n-1] - stones[0] + 1 == n){
            return new int[]{0, 0};
        }
        int max = Math.max(stones[n-1] - stones[1] + 1, stones[n-2] - stones[0] + 1) - (n - 1);
        int min = n;
        int l = 0;

        for (int r = 0; r < n; r++) {
            while (stones[r] - stones[l] >= n) {
                l++;
            }

            int currentCount = r - l + 1;

            // 【核心特判】：处理 n-1 个石子连续的特殊情况
            // 如果窗口内有 n-1 个石子 (currentCount == n - 1)
            // 且这 n-1 个石子是紧密连续的 (最大值 - 最小值 == n - 2)
            if (currentCount == n - 1 && stones[r] - stones[l] == n - 2) {
                min = Math.min(min, 2);
            } else {
                // 一般情况：需要移动的次数 = 总石子数 - 窗口内已有的石子数
                min = Math.min(min, n - currentCount);
            }
        }
        return new int[]{min,max};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}