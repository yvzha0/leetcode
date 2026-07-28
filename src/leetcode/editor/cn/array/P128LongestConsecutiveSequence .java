package leetcode.editor.cn.array;

import java.util.HashSet;
import java.util.Set;

class P128LongestConsecutiveSequence{
    public static void main(String[] args){
        Solution solution = new P128LongestConsecutiveSequence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        for(int val : set){
            if(!set.contains(val - 1)){
                int count = 1;
                while(set.contains(val + 1)){
                    val++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}