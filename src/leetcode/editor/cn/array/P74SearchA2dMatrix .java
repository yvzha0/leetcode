package leetcode.editor.cn.array;

class P74SearchA2dMatrix{
    public static void main(String[] args){
        Solution solution = new P74SearchA2dMatrix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m * n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            int i = mid / n;
            int j = mid - n * i;
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] < target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}