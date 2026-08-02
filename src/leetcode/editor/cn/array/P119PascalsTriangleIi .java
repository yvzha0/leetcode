package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P119PascalsTriangleIi{
    public static void main(String[] args){
        Solution solution = new P119PascalsTriangleIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] ans = new int[rowIndex + 1];
        ans[0] = 1;
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i; j >= 0; j--){
                int k, m;
                if(j - 1 < 0){
                    k = 0;
                }else {
                    k = ans[j - 1];
                }
                if(j > i - 1){
                    m = 0;
                }else {
                    m = ans[j];
                }
                ans[j] = k + m;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int a : ans){
            res.add(a);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}