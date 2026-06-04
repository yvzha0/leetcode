package leetcode.editor.cn.array;
class P1208GetEqualSubstringsWithinBudget{
    public static void main(String[] args){
        Solution solution = new P1208GetEqualSubstringsWithinBudget().new Solution();
        solution.equalSubstring("abcd","bcdf",3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < n){
            sum += diff[r];
            if(sum > maxCost){
                sum -= diff[l];
                l++;
            }
            r++;
        }
        return r - l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}