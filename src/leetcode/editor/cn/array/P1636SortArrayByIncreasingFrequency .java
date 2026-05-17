package leetcode.editor.cn.array;

import java.util.*;

class P1636SortArrayByIncreasingFrequency{
    public static void main(String[] args){
        Solution solution = new P1636SortArrayByIncreasingFrequency().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list, (a , b) -> {
            if(Objects.equals(map.get(a), map.get(b))){
                return b - a;
            }
            return map.get(a) - map.get(b);
        });
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}