package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P1748SumOfUniqueElements{
    public static void main(String[] args){
        Solution solution = new P1748SumOfUniqueElements().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                if(countMap.get(num) == 1){
                    ans -= num;
                }
                countMap.replace(num,2);
            } else{
                ans += num;
                countMap.put(num, 1);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}