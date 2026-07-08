package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P697DegreeOfAnArray{
    public static void main(String[] args){
        Solution solution = new P697DegreeOfAnArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int n = nums.length;
        int ans = 60000;
        int max = -1;
        for(int i = 0; i < n; i++){
            int[] arr = map.getOrDefault(nums[i], new int[]{i,0,0});
            arr[1] = i;
            arr[2]++;
            max = Math.max(max, arr[2]);
            map.put(nums[i], arr);
        }
        for(int[] arr : map.values()){
            if(arr[2] == max){
                ans = Math.min(ans, arr[1] - arr[0] + 1);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}