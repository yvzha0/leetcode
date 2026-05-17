package leetcode.editor.cn.array;
class P1732FindTheHighestAltitude{
    public static void main(String[] args){
        Solution solution = new P1732FindTheHighestAltitude().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int alt = 0;
        for(int i : gain){
            alt += i;
            ans = Integer.max(alt,ans);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}