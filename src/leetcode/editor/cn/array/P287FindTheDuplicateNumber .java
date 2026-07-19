package leetcode.editor.cn.array;

import java.util.HashSet;
import java.util.Set;

class P287FindTheDuplicateNumber{
    public static void main(String[] args){
        Solution solution = new P287FindTheDuplicateNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            if(set.contains(num)){
                ans = num;
                break;
            }
            set.add(num);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}