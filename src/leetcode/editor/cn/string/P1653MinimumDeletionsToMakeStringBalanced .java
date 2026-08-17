package leetcode.editor.cn.string;
class P1653MinimumDeletionsToMakeStringBalanced{
    public static void main(String[] args){
        Solution solution = new P1653MinimumDeletionsToMakeStringBalanced().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int minimumDeletions(String s) {
//        int righta = 0;
//        int leftb = 0;
//        int ans = 100000;
//        for(char c : s.toCharArray()){
//            if(c == 'a'){
//                righta++;
//            }
//        }
//        ans = Math.min(ans, righta);
//        for(char c : s.toCharArray()){
//            if(c == 'b'){
//                leftb++;
//            }else {
//                righta--;
//            }
//            ans = Math.min(ans, leftb + righta);
//        }
//        return ans;
//    }

    public int minimumDeletions(String s) {
        int bCount = 0;
        int dp = 0;
        for(char c : s.toCharArray()){
            if(c == 'b'){
                bCount++;
            }else {
                dp = Math.min(dp + 1, bCount);
            }
        }
        return dp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}