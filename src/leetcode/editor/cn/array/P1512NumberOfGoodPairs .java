package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P1512NumberOfGoodPairs{
    public static void main(String[] args){
        Solution solution = new P1512NumberOfGoodPairs().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int num : nums){
            int val = map.getOrDefault(num, 0);
            ans += val;
            map.put(num, val + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}