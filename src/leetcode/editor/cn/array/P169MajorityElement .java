package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P169MajorityElement{
    public static void main(String[] args){
        Solution solution = new P169MajorityElement().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            if(count > n / 2){
                ans = num;
                break;
            }
            map.put(num, count);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}