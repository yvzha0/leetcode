package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P228SummaryRanges{
    public static void main(String[] args){
        Solution solution = new P228SummaryRanges().new Solution();
        solution.summaryRanges(new int[]{0,1,2,4,5,7});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int start = i;
            while(i + 1 < n && nums[i + 1] == nums[i] + 1){
                i++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(nums[start]);
            if(start != i){
                sb.append("->").append(nums[i]);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}