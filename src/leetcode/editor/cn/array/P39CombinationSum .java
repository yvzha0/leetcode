package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P39CombinationSum{
    public static void main(String[] args){
        Solution solution = new P39CombinationSum().new Solution();
        solution.combinationSum(new int[] {4,2,8}, 8);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrace(candidates, target, ans, path, 0);
        return ans;
    }

    private void backtrace(int[] candidates, int target, List<List<Integer>> ans, List<Integer> path, int start){
        int n = candidates.length;
        if(start >= n){
            return;
        }
        for(; start < n; start++){
            if(candidates[start] == target){
                path.add(candidates[start]);
                ans.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }else if(candidates[start] < target){
                path.add(candidates[start]);
                backtrace(candidates, target - candidates[start], ans, path, start);
                path.remove(path.size() - 1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}