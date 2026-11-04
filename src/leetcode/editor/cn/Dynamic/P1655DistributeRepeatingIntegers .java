package leetcode.editor.cn.Dynamic;

import java.util.*;

class P1655DistributeRepeatingIntegers{
    public static void main(String[] args){
        Solution solution = new P1655DistributeRepeatingIntegers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] cnt = new int[map.size()];
        int index = 0;
        for(int val : map.values()){
            cnt[index++] = val;
        }
        Arrays.sort(quantity);
        return backtrace(quantity.length - 1, quantity, cnt);
    }

    private boolean backtrace(int i, int[] quantity, int[] cnt){
        if(i < 0){
            return true;
        }
        int need = quantity[i];
        Set<Integer> set = new HashSet<>();
        for(int j = 0; j < cnt.length; j++){
            if(cnt[j] < need || set.contains(cnt[j])){
                continue;
            }
            set.add(cnt[j]);
            cnt[j] -= need;
            if(backtrace(i - 1, quantity, cnt)){
                return true;
            }
            cnt[j] += need;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}