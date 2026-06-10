package leetcode.editor.cn.array;

import java.util.Arrays;

class P1051HeightChecker{
    public static void main(String[] args){
        Solution solution = new P1051HeightChecker().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int heightChecker(int[] heights) {
        int m = Arrays.stream(heights).max().getAsInt();
        int[] sorted = new int[m + 1];
        int ans = 0;
        for(int h : heights){
            sorted[h]++;
        }
        int pos = 0;
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < sorted[i]; j++){
                if(i != heights[pos]){
                    ans++;
                }
                pos++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}