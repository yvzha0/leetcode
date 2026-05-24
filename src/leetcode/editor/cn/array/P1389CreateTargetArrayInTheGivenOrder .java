package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1389CreateTargetArrayInTheGivenOrder{
    public static void main(String[] args){
        Solution solution = new P1389CreateTargetArrayInTheGivenOrder().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}