package leetcode.editor.cn.Dynamic;

import java.util.HashMap;
import java.util.Map;

class P523ContinuousSubarraySum{
    public static void main(String[] args){
        Solution solution = new P523ContinuousSubarraySum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int n = nums.length;
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int r = sum % k;
            if(map.containsKey(r)){
                if(i - map.get(r) >= 2){
                    return true;
                }
            }else {
                map.put(r, i);
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}