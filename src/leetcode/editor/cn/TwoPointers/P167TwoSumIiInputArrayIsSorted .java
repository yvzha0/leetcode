package leetcode.editor.cn.TwoPointers;
class P167TwoSumIiInputArrayIsSorted{
    public static void main(String[] args){
        Solution solution = new P167TwoSumIiInputArrayIsSorted().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int r = n - 1;
        while(l < r && numbers[l] + numbers[r] != target){
            if(numbers[l] + numbers[r] > target){
                r--;
            }else {
                l++;
            }
        }
        return new int[] {l + 1, r + 1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}