package leetcode.editor.cn.array;

import java.util.HashSet;
import java.util.Set;

class P217ContainsDuplicate{
    public static void main(String[] args){
        Solution solution = new P217ContainsDuplicate().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if (set.contains(num)){
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}