package leetcode.editor.cn.array;

import java.util.*;

class P229MajorityElementIi{
    public static void main(String[] args){
        Solution solution = new P229MajorityElementIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            if(map.containsKey(num)){
                int a = map.get(num);
                if(a != -1){
                    if(a + 1 > n / 3){
                        ans.add(num);
                        map.put(num, -1);
                    }else {
                        map.put(num, a + 1);
                    }
                }
            }else {
                if(1 > n / 3){
                    ans.add(num);
                    map.put(num, -1);
                }else {
                    map.put(num, 1);
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}