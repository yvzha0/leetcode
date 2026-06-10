package leetcode.editor.cn.array;
class P1052GrumpyBookstoreOwner{
    public static void main(String[] args){
        Solution solution = new P1052GrumpyBookstoreOwner().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int subsum = 0;
        int l = 0;
        int r = 0;
        int ans = 0;
        for(; r < minutes; r++){
            if(grumpy[r] == 1){
                subsum += customers[r];
            }else {
                ans += customers[r];
            }
        }
        int maxadd = subsum;
        int n = grumpy.length;
        for(; r < n; r++){
            if(grumpy[r] == 1){
                subsum += customers[r];
            }else {
                ans += customers[r];
            }
            if(grumpy[l] == 1){
                subsum -= customers[l];
            }
            l++;
            maxadd = Math.max(maxadd, subsum);
        }
        return ans + maxadd;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}