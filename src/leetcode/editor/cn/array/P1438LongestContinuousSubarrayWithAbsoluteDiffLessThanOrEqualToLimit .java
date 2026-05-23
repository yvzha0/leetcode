package leetcode.editor.cn.array;

import java.util.TreeMap;

class P1438LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit{
    public static void main(String[] args){
        Solution solution = new P1438LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        for(int right = 0; right < n; right++){
            int rightVal = nums[right];
            map.put(rightVal, map.getOrDefault(rightVal, 0) + 1);
            while(map.lastKey() - map.firstKey() > limit){
                int leftVal = nums[left];
                left++;
                map.put(leftVal, map.get(leftVal) - 1);
                if(map.get(leftVal) == 0){
                    map.remove(leftVal);
                }
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}