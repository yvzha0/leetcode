package leetcode.editor.cn.array;
class P79WordSearch{
    public static void main(String[] args){
        Solution solution = new P79WordSearch().new Solution();
        solution.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        }, "ABCB");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if(m * n < word.length()){
            return false;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (dfs(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, String word, int idx){
        if(idx >= word.length()){
            return true;
        }
        char start = word.charAt(idx);
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != start) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        for (int[] dir : dirs) {
            if(dfs(i + dir[0], j + dir[1], board, word, idx + 1)){
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}