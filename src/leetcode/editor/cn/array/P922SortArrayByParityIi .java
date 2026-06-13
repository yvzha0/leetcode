package leetcode.editor.cn.array;
class P922SortArrayByParityIi{
    public static void main(String[] args){
        Solution solution = new P922SortArrayByParityIi().new Solution();
        solution.sortArrayByParityII(new int[]{4,2,5,7});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int a = 1;
        int b = 0;
        int n = nums.length;
        while(true){
            while(a < n && nums[a] % 2 == 1){
                a += 2;
            }
            while(b < n && nums[b] % 2 == 0){
                b += 2;
            }
            if(a >= n || b >= n){
                break;
            }
            int tmp = nums[a];
            nums[a] = nums[b];
            nums[b] = tmp;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}