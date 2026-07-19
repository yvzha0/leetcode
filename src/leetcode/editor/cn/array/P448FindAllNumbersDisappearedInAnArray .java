package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P448FindAllNumbersDisappearedInAnArray{
    public static void main(String[] args){
        Solution solution = new P448FindAllNumbersDisappearedInAnArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
        for(int num : nums){
            hash[num]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if(hash[i] == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}