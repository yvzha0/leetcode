package leetcode.editor.cn.array;
class P48RotateImage{
    public static void main(String[] args){
        Solution solution = new P48RotateImage().new Solution();
        solution.rotate(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}