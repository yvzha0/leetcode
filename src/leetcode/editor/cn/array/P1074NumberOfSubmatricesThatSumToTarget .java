package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P1074NumberOfSubmatricesThatSumToTarget{
    public static void main(String[] args){
        Solution solution = new P1074NumberOfSubmatricesThatSumToTarget().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            int[] nums = new int[n];
            for(int j = i; j < m; j++){
                for(int k = 0; k <n; k++){
                    nums[k] += matrix[j][k];
                }
                ans += subarraySum(nums, target);
            }
        }
        return ans;
    }

    private int subarraySum(int[] nums, int k) {
        // [i,j]和为pre[j] - pre[i - 1] = k
        int count = 0;
        int pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            pre += num;
            if(map.containsKey(pre - k)){
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}