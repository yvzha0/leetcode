package leetcode.editor.cn.array;
class P1217MinimumCostToMoveChipsToTheSamePosition{
    public static void main(String[] args){
        Solution solution = new P1217MinimumCostToMoveChipsToTheSamePosition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostToMoveChips(int[] position) {
        int ji = 0;
        int ou = 0;
        for(int p : position){
            if (p % 2 == 0){
                ou++;
            }else {
                ji++;
            }
        }
        return Math.min(ji,ou);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}