package leetcode.editor.cn.TwoPointers;

import java.util.Arrays;
import java.util.Comparator;

class P826MostProfitAssigningWork{
    public static void main(String[] args){
        Solution solution = new P826MostProfitAssigningWork().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;
        Integer[] index = new Integer[n];
        for(int i = 0; i < n; i++){
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(a -> profit[a]));
        Arrays.sort(worker);
        int i = n - 1;
        int j = m - 1;
        int ans = 0;
        while(i >= 0 && j >= 0){
            int idx = index[i];
            if(worker[j] >= difficulty[idx]){
                ans += profit[idx];
                j--;
            }else {
                i--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}