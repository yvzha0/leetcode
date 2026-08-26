package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P696CountBinarySubstrings{
    public static void main(String[] args){
        Solution solution = new P696CountBinarySubstrings().new Solution();
        solution.countBinarySubstrings("00110011");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                list.add(count);
                count = 1;
            }else {
                count++;
            }
        }
        list.add(count);
        for(int i = 1; i < list.size(); i++){
            ans += Math.min(list.get(i), list.get(i - 1));
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}