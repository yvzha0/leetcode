package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1380LuckyNumbersInAMatrix{
    public static void main(String[] args){
        Solution solution = new P1380LuckyNumbersInAMatrix().new Solution();
        solution.luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] lmin = new int[m][2];
        int[] cmax = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int val = matrix[i][j];
                if(lmin[i][0] == 0 || val < lmin[i][0]){
                    lmin[i][0] = val;
                    lmin[i][1] = j;
                }
                if(val > cmax[j]){
                    cmax[j] = val;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(lmin[i][0] == cmax[lmin[i][1]]){
                ans.add(lmin[i][0]);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}