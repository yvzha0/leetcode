package leetcode.editor.cn.array;

import java.util.*;

class P78Subsets{
    public static void main(String[] args){
        Solution solution = new P78Subsets().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrace(nums, ans, 0, path);
        return ans;
    }

    public void backtrace(int[] nums, List<List<Integer>> ans, int start, List<Integer> path){
        int n = nums.length;
        ans.add(new ArrayList<>(path));
        for(int i = start; i < n; i++){
            path.add(nums[i]);
            backtrace(nums, ans, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}