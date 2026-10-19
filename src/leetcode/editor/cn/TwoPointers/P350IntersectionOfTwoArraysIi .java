package leetcode.editor.cn.TwoPointers;

import java.util.*;

class P350IntersectionOfTwoArraysIi{
    public static void main(String[] args){
        Solution solution = new P350IntersectionOfTwoArraysIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int num : nums1){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for(int num : nums2){
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map1.keySet()){
            if(map2.containsKey(key)){
                for(int i = 0; i < Math.min(map1.get(key), map2.get(key)); i++){
                    list.add(key);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}