package leetcode.editor.cn.array;

import java.util.*;

class P90SubsetsIi{
    public static void main(String[] args){
        Solution solution = new P90SubsetsIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backtrace(nums, path, 0, ans);
        return ans;
    }

    private void backtrace(int[] nums, List<Integer> path, int start, List<List<Integer>> ans){
        int n = nums.length;
        ans.add(new ArrayList<>(path));
        for(int i = start; i < n; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            backtrace(nums, path, i + 1, ans);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}