package leetcode.editor.cn.array;
class P1295FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        Solution solution = new P1295FindNumbersWithEvenNumberOfDigits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums){
            if(getWeishu(num) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    public int getWeishu(int num){
        int res = 0;
        while(num > 0){
            res++;
            num /= 10;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}