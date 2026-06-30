package leetcode.editor.cn.array;

import java.util.HashSet;
import java.util.Set;

class P888FairCandySwap{
    public static void main(String[] args){
        Solution solution = new P888FairCandySwap().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bob = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        for(int a : aliceSizes){
            sum1 += a;
        }
        for(int b : bobSizes){
            bob.add(b);
            sum2 += b;
        }
        int avg = (sum1 + sum2) / 2;
        int[] ans = new int[2];
        for(int a : aliceSizes){
            int b = avg + a - sum1;
            if(bob.contains(b)){
                ans[0] = a;
                ans[1] = b;
                break;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}