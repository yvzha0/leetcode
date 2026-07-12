package leetcode.editor.cn.array;

import java.util.*;

class P532KDiffPairsInAnArray{
    public static void main(String[] args){
        Solution solution = new P532KDiffPairsInAnArray().new Solution();
        solution.findPairs(new int[] {1,3,1,5,4}, 0);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            if (set.contains(num - k)){
                if(!set1.contains(num - k)){
                    ans++;
                    set1.add(num - k);
                }
            }
            if (set.contains(num + k)){
                if(!set1.contains(num)){
                    ans++;
                    set1.add(num);
                }
            }
            set.add(num);
        }
        return ans;
    }

//    public int findPairs(int[] nums, int k) {
//        int ans = 0;
//        Arrays.sort(nums);
//        int n = nums.length;
//        int r = 1;
//        for(int l = 0; l < n; l++){
//            if(l == 0 || nums[l] != nums[l - 1]){
//                while(r < n && (nums[r] < nums[l] + k || r <= l)){
//                    r++;
//                }
//                if(r < n){
//                    if(nums[r] == nums[l] + k){
//                        ans++;
//                    }
//                }else {
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
}




//leetcode submit region end(Prohibit modification and deletion)

}