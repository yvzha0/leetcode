package leetcode.editor.cn.array;
class P867TransposeMatrix{
    public static void main(String[] args){
        Solution solution = new P867TransposeMatrix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}