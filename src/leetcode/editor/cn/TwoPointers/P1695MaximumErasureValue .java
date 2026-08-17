package leetcode.editor.cn.TwoPointers;

import java.util.HashSet;
import java.util.Set;

class P1695MaximumErasureValue{
    public static void main(String[] args){
        Solution solution = new P1695MaximumErasureValue().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l = 0;
        int sum = 0;
        int ans = 0;
        for (int num : nums) {
            while(set.contains(num)){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(num);
            sum += num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}