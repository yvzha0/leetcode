package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P18FourSum{
    public static void main(String[] args){
        Solution solution = new P18FourSum().new Solution();
        solution.fourSum(new int[] {1,0,-1,0,-2,2}, 0);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        if (n < 4) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // i 去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 最小可能值都大于 target，后面不用继续了
            long minSum = (long) nums[i]
                    + nums[i + 1]
                    + nums[i + 2]
                    + nums[i + 3];

            if (minSum > target) {
                break;
            }

            // 最大可能值仍然小于 target，当前 i 不可能有答案
            long maxSum = (long) nums[i]
                    + nums[n - 1]
                    + nums[n - 2]
                    + nums[n - 3];

            if (maxSum < target) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                // j 去重
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i]
                            + nums[j]
                            + nums[left]
                            + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        // left 去重
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // right 去重
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}