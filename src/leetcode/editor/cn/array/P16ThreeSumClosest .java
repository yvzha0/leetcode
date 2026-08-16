package leetcode.editor.cn.array;

import java.util.Arrays;

class P16ThreeSumClosest{
    public static void main(String[] args){
        Solution solution = new P16ThreeSumClosest().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return sum;
                }else if(sum < target){
                    l++;
                }else {
                    r--;
                }
                if(Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}