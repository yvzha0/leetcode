package leetcode.editor.cn.array;
class P661ImageSmoother{
    public static void main(String[] args){
        Solution solution = new P661ImageSmoother().new Solution();
        solution.imageSmoother(new int[][]{
                {100,200,100},
                {200,50,200},
                {100,200,100}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] preSum = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                preSum[i + 1][j + 1] = img[i][j] + preSum[i][j + 1] + preSum[i + 1][j] - preSum[i][j];
            }
        }
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int rowStart = Math.max(0, i - 1);
                int rowEnd = Math.min(m - 1, i + 1);
                int colStart = Math.max(0, j - 1);
                int colEnd = Math.min(n - 1, j + 1);

                int sum = preSum[rowEnd + 1][colEnd + 1] - preSum[rowStart][colEnd + 1] - preSum[rowEnd + 1][colStart] + preSum[rowStart][colStart];
                int count = (rowEnd - rowStart + 1) * (colEnd - colStart + 1);

                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}