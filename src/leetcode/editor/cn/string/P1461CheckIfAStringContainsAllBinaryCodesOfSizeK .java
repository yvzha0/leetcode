package leetcode.editor.cn.string;

import java.util.HashSet;
import java.util.Set;

class P1461CheckIfAStringContainsAllBinaryCodesOfSizeK{
    public static void main(String[] args){
        Solution solution = new P1461CheckIfAStringContainsAllBinaryCodesOfSizeK().new Solution();
        solution.hasAllCodes("00110", 2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length() - k + 1; i++){
            set.add(s.substring(i, i + k));
        }
        return set.size() == (1 << k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}