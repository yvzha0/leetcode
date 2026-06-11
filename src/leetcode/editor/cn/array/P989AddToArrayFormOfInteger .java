package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class P989AddToArrayFormOfInteger{
    public static void main(String[] args){
        Solution solution = new P989AddToArrayFormOfInteger().new Solution();
        solution.addToArrayForm(new int[]{1,2,0,0},34);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = num.length;
        int jinwei = 0;
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + jinwei + k;
            num[i] = sum % 10;
            jinwei = sum / 10;
            k = 0;
        }
        while (jinwei > 0) {
            ans.add(jinwei % 10);
            jinwei /= 10;
        }
        Collections.reverse(ans);
        for (int a : num) {
            ans.add(a);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}