package leetcode.editor.cn.array;
class P1232CheckIfItIsAStraightLine{
    public static void main(String[] args){
        Solution solution = new P1232CheckIfItIsAStraightLine().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n == 2){
            return true;
        }
        for(int i = 1; i < n - 1; i++){
            int x1 = coordinates[i - 1][0];
            int x2 = coordinates[i][0];
            int x3 = coordinates[i + 1][0];
            int y1 = coordinates[i - 1][1];
            int y2 = coordinates[i][1];
            int y3 = coordinates[i + 1][1];
            if((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}