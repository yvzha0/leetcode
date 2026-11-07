package leetcode.editor.cn.Dynamic;

import java.util.HashSet;
import java.util.Set;

class P898BitwiseOrsOfSubarrays{
    public static void main(String[] args){
        Solution solution = new P898BitwiseOrsOfSubarrays().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> pre = new HashSet<>();
        for(int a : arr){
            Set<Integer> cur = new HashSet<>();
            cur.add(a);
            for(int val : pre){
                cur.add(a | val);
            }
            ans.addAll(cur);
            pre = cur;
        }
        return ans.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}