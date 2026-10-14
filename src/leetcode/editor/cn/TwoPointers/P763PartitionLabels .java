package leetcode.editor.cn.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P763PartitionLabels{
    public static void main(String[] args){
        Solution solution = new P763PartitionLabels().new Solution();
        solution.partitionLabels("caedbdedda");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), i);
        }
        int l = 0;
        while(l < n){
            int start = l;
            int r = map.get(s.charAt(l));
            while(l < r){
                r = Math.max(r, map.get(s.charAt(l)));
                l++;
            }
            ans.add(r - start + 1);
            l++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}