package leetcode.editor.cn.array;
class P1572MatrixDiagonalSum{
    public static void main(String[] args){
        Solution solution = new P1572MatrixDiagonalSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans += mat[i][i];
            ans += mat[i][n-i-1];
        }
        if(n % 2 != 0){
            ans -= mat[(n-1)/2][(n-1)/2];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}