package leetcode.editor.cn.TwoPointers;
class P457CircularArrayLoop{
    public static void main(String[] args){
        Solution solution = new P457CircularArrayLoop().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                continue;
            }
            int slow = i;
            int fast = next(nums, i);

            while (nums[slow] * nums[fast] > 0 && nums[slow] * nums[next(nums, fast)] > 0){
                if(slow == fast){
                    if(slow == next(nums, slow)){
                        break;
                    }
                    return true;
                }
                slow = next(nums, slow);
                fast = next(nums, next(nums, fast));
            }
            int direction = nums[i];
            int j = i;
            while(nums[j] * direction > 0){
                int tmp = next(nums, j);
                nums[j] = 0;
                j = tmp;
            }
        }
        return false;
    }

    private int next(int[] nums, int cur){
        int n = nums.length;
        return ((cur + nums[cur]) % n + n) % n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}