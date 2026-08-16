package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P40CombinationSumIi{
    public static void main(String[] args){
        Solution solution = new P40CombinationSumIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        for(int i = start; i < n; i++){
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] == target){
                path.add(candidates[i]);
                ans.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }else if(candidates[i] < target){
                path.add(candidates[i]);
                backtrace(candidates, target - candidates[i], ans, path, i + 1);
                path.remove(path.size() - 1);
            }else {
                break;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}