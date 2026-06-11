package leetcode.editor.cn.array;
class P985SumOfEvenNumbersAfterQueries{
    public static void main(String[] args){
        Solution solution = new P985SumOfEvenNumbersAfterQueries().new Solution();
        solution.sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int num : nums){
            if((num & 1) == 0){
                sum += num;
            }
        }
        for(int i = 0; i < n; i++){
            int[] query = queries[i];
            int index = query[1];
            int val = query[0];
            if((nums[index] & 1) == 0){
                sum -= nums[index];
            }
            nums[index] += val;
            if((nums[index] & 1) == 0){
                sum += nums[index];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}