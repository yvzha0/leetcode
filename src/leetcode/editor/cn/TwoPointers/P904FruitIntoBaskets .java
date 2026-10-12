package leetcode.editor.cn.TwoPointers;

import java.util.HashMap;
import java.util.Map;

class P904FruitIntoBaskets{
    public static void main(String[] args){
        Solution solution = new P904FruitIntoBaskets().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int l = 0;
        int ans = 0;
        for(int r = 0; r < n; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size() > 2){
                if(map.get(fruits[l]) == 1){
                    map.remove(fruits[l]);
                }else {
                    map.put(fruits[l], map.get(fruits[l]) - 1);
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}