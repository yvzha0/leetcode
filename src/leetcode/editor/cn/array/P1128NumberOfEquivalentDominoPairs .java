package leetcode.editor.cn.array;

class P1128NumberOfEquivalentDominoPairs{
    public static void main(String[] args){
        Solution solution = new P1128NumberOfEquivalentDominoPairs().new Solution();
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        solution.numEquivDominoPairs(dominoes);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];
        int ans = 0;
        for(int[] d : dominoes){
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b;
            ans += map[key];
            map[key]++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}