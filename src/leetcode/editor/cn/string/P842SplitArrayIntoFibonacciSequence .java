package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P842SplitArrayIntoFibonacciSequence{
    public static void main(String[] args){
        Solution solution = new P842SplitArrayIntoFibonacciSequence().new Solution();
        solution.splitIntoFibonacci("1101111");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        int n = num.length();
        for(int i = 1; i <= n - 2; i++){
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long x = Long.parseLong(num.substring(0, i));
            if(x > Integer.MAX_VALUE){
                break;
            }
            for(int j = i + 1; j <= n - 1; j++){
                if(num.charAt(i) == '0' && j > i + 1){
                    break;
                }
                long y = Long.parseLong(num.substring(i, j));
                if(y > Integer.MAX_VALUE){
                    break;
                }
                int index = j;
                List<Integer> ans = new ArrayList<>();
                ans.add((int) x);
                ans.add((int) y);
                long a = x;
                long b = y;
                while(index < n){
                    long next = a + b;
                    if(next > Integer.MAX_VALUE){
                        break;
                    }
                    String pre = String.valueOf(next);
                    if(!num.startsWith(pre, index)){
                        break;
                    }
                    ans.add(Integer.valueOf(pre));
                    index += pre.length();
                    a = b;
                    b = next;
                }
                if(index == n){
                    return ans;
                }
            }
        }
        return new ArrayList<>();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}