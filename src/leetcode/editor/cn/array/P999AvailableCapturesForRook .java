package leetcode.editor.cn.array;
class P999AvailableCapturesForRook{
    public static void main(String[] args){
        Solution solution = new P999AvailableCapturesForRook().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        int[] a = findR(board);
        int x = a[0];
        int y = a[1];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            while(nextX < 8 && nextX >= 0 && nextY < 8 && nextY >= 0){
                if(board[nextX][nextY] == 'p'){
                    ans++;
                    break;
                }else if(board[nextX][nextY] == 'B') {
                    break;
                }
                nextX += dx[i];
                nextY += dy[i];
            }
        }
        return ans;
    }
    public int[] findR(char[][] board){
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if(board[x][y] == 'R'){
                    return new int[]{x, y};
                }
            }
        }
        return new int[2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}