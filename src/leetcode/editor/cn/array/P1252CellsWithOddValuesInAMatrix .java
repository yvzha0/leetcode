package leetcode.editor.cn.array;
class P1252CellsWithOddValuesInAMatrix{
    public static void main(String[] args){
        Solution solution = new P1252CellsWithOddValuesInAMatrix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] indice : indices){
            row[indice[0]]++;
            col[indice[1]]++;
        }
        int oddx = 0;
        for(int r : row){
            if(r % 2 == 1){
                oddx++;
            }
        }
        int oddy = 0;
        for (int c : col){
            if (c % 2 == 1){
                oddy++;
            }
        }
        return oddx * (n - oddy) + oddy * (m - oddx);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}