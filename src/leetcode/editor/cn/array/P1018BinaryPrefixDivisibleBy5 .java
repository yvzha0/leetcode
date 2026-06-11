package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1018BinaryPrefixDivisibleBy5{
    public static void main(String[] args){
        Solution solution = new P1018BinaryPrefixDivisibleBy5().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int x = 0;
        for(int num : nums){
            x = (x * 2 + num) % 5;
            ans.add(x == 0);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}