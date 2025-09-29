package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/*

 */

class P1TwoSum{
    public static void main(String[] args){
        Solution solution = new P1TwoSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}