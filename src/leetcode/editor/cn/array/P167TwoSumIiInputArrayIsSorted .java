package leetcode.editor.cn.array;
class P167TwoSumIiInputArrayIsSorted{
    public static void main(String[] args){
        Solution solution = new P167TwoSumIiInputArrayIsSorted().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if (sum == target){
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }
            if(sum > target){
                r--;
            }else {
                l++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}