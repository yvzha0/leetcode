package leetcode.editor.cn.array;
class P1470ShuffleTheArray{
    public static void main(String[] args){
        Solution solution = new P1470ShuffleTheArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int x = 0, y = n;
        for(int i = 0; i < 2 * n; i += 2){
            ans[i] = nums[x];
            ans[i + 1] = nums[y];
            x++;
            y++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}