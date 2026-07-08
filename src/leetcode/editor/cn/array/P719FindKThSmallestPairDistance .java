package leetcode.editor.cn.array;

import java.util.Arrays;

class P719FindKThSmallestPairDistance{
    public static void main(String[] args){
        Solution solution = new P719FindKThSmallestPairDistance().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = nums[n - 1] - nums[0];
        while(l < r){
            int mid = l + (r - l) / 2;
            int cnt = count(nums, mid);
            if(cnt >= k){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int count(int[] nums, int mid){
        int cnt = 0;
        int l = 0;
        for(int r = 1; r < nums.length; r++){
            while(nums[r] - nums[l] > mid){
                l++;
            }
            cnt += r - l;
        }
        return cnt;
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}