package leetcode.editor.cn.TwoPointers;

class P930BinarySubarraysWithSum{
    public static void main(String[] args){
        Solution solution = new P930BinarySubarraysWithSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int numSubarraysWithSum(int[] nums, int goal) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//        int ans = 0;
//        for (int num : nums) {
//            sum += num;
//            if (sum == goal) {
//                ans++;
//            }
//            ans += map.getOrDefault(sum - goal, 0);
//            map.put(sum, map.getOrDefault(sum, 0) + 1);
//        }
//        return ans;
//    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums, goal) - f(nums, goal - 1);
    }

    private int f(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int l = 0;
        int sum = 0;
        int res = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}