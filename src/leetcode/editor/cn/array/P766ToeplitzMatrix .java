package leetcode.editor.cn.array;
class P766ToeplitzMatrix{
    public static void main(String[] args){
        Solution solution = new P766ToeplitzMatrix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}