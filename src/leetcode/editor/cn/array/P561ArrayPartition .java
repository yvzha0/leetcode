package leetcode.editor.cn.array;

import java.util.Arrays;

class P561ArrayPartition{
    public static void main(String[] args){
        Solution solution = new P561ArrayPartition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i += 2){
            ans += nums[i];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}