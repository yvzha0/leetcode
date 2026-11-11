package leetcode.editor.cn.Dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P638ShoppingOffers{
    public static void main(String[] args){
        Solution solution = new P638ShoppingOffers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs){
        String key = needs.toString();

        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = 0;
        int n = price.size();
        for(int i = 0; i < n; i++){
            res += price.get(i) * needs.get(i);
        }
        for(List<Integer> offered : special){
            boolean valid = true;
            List<Integer> next = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(offered.get(i) > needs.get(i)){
                    valid = false;
                    break;
                }
                next.add(needs.get(i) - offered.get(i));
            }
            if(valid){
                int cost = offered.get(n) + dfs(price, special, next);
                res = Math.min(res, cost);
            }
        }
        memo.put(key, res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}