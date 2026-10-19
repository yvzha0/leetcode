package leetcode.editor.cn.TwoPointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class P349IntersectionOfTwoArrays{
    public static void main(String[] args){
        Solution solution = new P349IntersectionOfTwoArrays().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int val : set1){
            if(set2.contains(val)){
                list.add(val);
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