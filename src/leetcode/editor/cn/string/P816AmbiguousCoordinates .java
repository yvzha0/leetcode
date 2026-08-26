package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P816AmbiguousCoordinates{
    public static void main(String[] args){
        Solution solution = new P816AmbiguousCoordinates().new Solution();
        solution.ambiguousCoordinates("(0123)");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> ambiguousCoordinates(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        for(int i = 2; i <= n - 2; i++){
            String pre = s.substring(1, i);
            String end = s.substring(i, n - 1);
            List<String> pres = addPoint(pre);
            List<String> ends = addPoint(end);
            for(String s1 : pres){
                for(String s2 : ends){
                    ans.add('(' + s1 + ", " + s2 + ')');
                }
            }
        }
        return ans;
    }

    private List<String> addPoint(String s){
        List<String> res = new ArrayList<>();
        int n = s.length();
        if(n == 1){
            res.add(s);
            return res;
        }
        if(judge(s, 0)){
            res.add(s);
        }
        for(int i = 1; i <= n - 1; i++){
            String pre = s.substring(0, i);
            String end = s.substring(i);
            if(judge(pre, 0) && judge(end, 1)){
                res.add(pre + '.' + end);
            }
        }
        return res;
    }

    private boolean judge(String s, int flag){
        if(flag == 0){
            if(s.length() == 1){
                return true;
            }
            return s.charAt(0) != '0';
        }
        return s.charAt(s.length() - 1) != '0';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}