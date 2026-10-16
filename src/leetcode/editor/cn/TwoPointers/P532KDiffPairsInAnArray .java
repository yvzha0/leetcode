package leetcode.editor.cn.TwoPointers;

import java.util.HashMap;
import java.util.Map;

class P532KDiffPairsInAnArray{
    public static void main(String[] args){
        Solution solution = new P532KDiffPairsInAnArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for(int val : map.keySet()){
            if(k == 0){
                if(map.get(val) > 1){
                    ans++;
                }
                continue;
            }
            if(map.containsKey(val + k)){
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}