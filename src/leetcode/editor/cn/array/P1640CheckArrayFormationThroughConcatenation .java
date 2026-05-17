package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P1640CheckArrayFormationThroughConcatenation{
    public static void main(String[] args){
        Solution solution = new P1640CheckArrayFormationThroughConcatenation().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,int[]> map = new HashMap<>();
        for(int[] p : pieces){
            map.put(p[0],p);
        }
        int pos = 0;
        for(int i = 0;i < pieces.length;i++){
            if(!map.containsKey(arr[pos])){
                return false;
            }
            int[] p = map.get(arr[pos]);
            for (int k : p) {
                if (k != arr[pos]) {
                    return false;
                }
                pos++;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}