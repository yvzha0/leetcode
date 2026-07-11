package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P560SubarraySumEqualsK{
    public static void main(String[] args){
        Solution solution = new P560SubarraySumEqualsK().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        // [i,j]和为pre[j] - pre[i - 1] = k
        int count = 0;
        int pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            pre += num;
            if(map.containsKey(pre - k)){
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}