package leetcode.editor.cn.TwoPointers;

import java.util.HashMap;
import java.util.Map;

class P992SubarraysWithKDifferentIntegers{
    public static void main(String[] args){
        Solution solution = new P992SubarraysWithKDifferentIntegers().new Solution();
        solution.f(new int[] {1,2,1,2,3}, 2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums, k) - f(nums, k - 1);
    }

    private int f(int[] nums, int k){
        int n = nums.length;
        int res = 0;
        int l = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int r = 0; r < n; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while(map.size() > k){
                if(map.get(nums[l]) == 1){
                    map.remove(nums[l]);
                }else {
                    map.put(nums[l], map.get(nums[l]) - 1);
                }
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}