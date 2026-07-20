package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P216CombinationSumIii{
    public static void main(String[] args){
        Solution solution = new P216CombinationSumIii().new Solution();
        solution.combinationSum3(3, 9);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrace(ans, path, k, n, 1);
        return ans;
    }

    private void backtrace(List<List<Integer>> ans, List<Integer> path, int k, int n, int start){
        if(k == 0){
            if(n == 0){
                ans.add(new ArrayList<>(path));
            }
            return;
        }
        if((2 * start + k - 1) * k / 2 > n){
            return;
        }
        if((19 - k) * k / 2 < n){
            return;
        }
        for(int i = start; i < 10; i++){
            path.add(i);
            backtrace(ans, path, k - 1, n - i, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}