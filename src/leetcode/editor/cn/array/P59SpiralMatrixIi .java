package leetcode.editor.cn.array;
class P59SpiralMatrixIi{
    public static void main(String[] args){
        Solution solution = new P59SpiralMatrixIi().new Solution();
        solution.generateMatrix(4);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        fill(ans, 1, 0, 0, n);
        return ans;
    }

    private void fill(int[][] ans, int start, int i, int j, int n){
        if(n == 1){
            ans[i][j] = start;
            return;
        }
        if(n <= 0){
            return;
        }
        for(int a = j; a < j + n; a++){
            ans[i][a] = start;
            start++;
        }
        for(int a = i + 1; a < i + n; a++){
            ans[a][j + n - 1] = start;
            start++;
        }
        for(int a = j + n - 2; a >= j; a--){
            ans[i + n - 1][a] = start;
            start++;
        }
        for(int a = i + n - 2; a > i; a--){
            ans[a][j] = start;
            start++;
        }
        fill(ans, start, i + 1, j + 1, n - 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}