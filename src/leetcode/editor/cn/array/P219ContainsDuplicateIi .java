package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P219ContainsDuplicateIi{
    public static void main(String[] args){
        Solution solution = new P219ContainsDuplicateIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    return true;
                }else {
                    map.put(nums[i], i);
                }
            }else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            if(set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//            if(set.size() > k){
//                set.remove(nums[i - k]);
//            }
//        }
//        return false;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}