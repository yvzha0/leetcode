package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P93RestoreIpAddresses{
    public static void main(String[] args){
        Solution solution = new P93RestoreIpAddresses().new Solution();
        solution.restoreIpAddresses("0000");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12){
            return new ArrayList<>();
        }
        return split(s, 0, 4);
    }

    private List<String> split(String s, int start, int num){
        List<String> res = new ArrayList<>();
        if(s.length() - start < num){
            return res;
        }
        if(num == 1){
            if(isValid(s, start, s.length() - 1)){
                res.add(s.substring(start));
            }
            return res;
        }
        for(int i = start + 1; i <= s.length(); i++){
            if(!isValid(s, start, i - 1)){
                break;
            }
            StringBuilder sb = new StringBuilder(s.substring(start, i));
            sb.append('.');
            List<String> list = split(s, i, num - 1);
            for(String a : list){
                res.add(sb + a);
            }
        }
        return res;
    }

    private boolean isValid(String s, int start, int end){
        if(end - start + 1 > 1 && s.charAt(start) == '0'){
            return false;
        }
        if(end - start + 1 > 3){
            return false;
        }
        if(end - start + 1 < 3){
            return true;
        }
        int ip = Integer.parseInt(s.substring(start, end + 1));
        return ip >= 0 && ip <= 255;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}