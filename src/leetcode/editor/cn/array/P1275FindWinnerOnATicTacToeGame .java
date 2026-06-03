package leetcode.editor.cn.array;
class P1275FindWinnerOnATicTacToeGame{
    public static void main(String[] args){
        Solution solution = new P1275FindWinnerOnATicTacToeGame().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String tictactoe(int[][] moves) {
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            // 玩家 A (先手) 记为 1，玩家 B (后手) 记为 -1
            int val = (i % 2 == 0) ? 1 : -1;

            // 更新对应行、列的得分
            rows[r] += val;
            cols[c] += val;

            // 如果在主对角线上 (左上到右下)
            if (r == c) {
                diag1 += val;
            }
            // 如果在副对角线上 (右上到左下)
            if (r + c == 2) {
                diag2 += val;
            }

            // 检查是否有玩家获胜 (某一行、列或对角线的得分绝对值达到 3)
            if (Math.abs(rows[r]) == 3 || Math.abs(cols[c]) == 3 || Math.abs(diag1) == 3 || Math.abs(diag2) == 3) {
                return val == 1 ? "A" : "B";
            }
        }

        // 如果没有人获胜，判断是平局还是游戏未结束
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}