package leetcode.editor.cn.array;

import java.util.Arrays;

class P2784CheckIfArrayIsGood{
    public static void main(String[] args){
        Solution solution = new P2784CheckIfArrayIsGood().new Solution();
        int[] nums = {1, 3, 3, 2};
        System.out.println(solution.isGood(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isGood(int[] nums) {
        int n = Arrays.stream(nums).max().getAsInt(); //获取最大值
        if(n != nums.length - 1){
            return false;
        }
        int[] cnt = new int[n + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i < n; i++) {
            if (cnt[i] != 1) {
                return false;
            }
        }
        return cnt[n] == 2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}