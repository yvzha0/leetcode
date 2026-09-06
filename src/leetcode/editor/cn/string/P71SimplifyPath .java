package leetcode.editor.cn.string;

import java.util.ArrayDeque;
import java.util.Deque;

class P71SimplifyPath{
    public static void main(String[] args){
        Solution solution = new P71SimplifyPath().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        path += "/";
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(char c : path.toCharArray()){
            if(c == '/'){
                if(!sb.isEmpty()){
                    if(sb.toString().equals("..")){
                        if(!stack.isEmpty()){
                            stack.pop();
                        }
                    }else if(!sb.toString().equals(".")){
                        stack.push(sb.toString());
                    }
                    sb.setLength(0);
                }
            }else {
                sb.append(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append("/");
            ans.append(stack.removeLast());
        }
        return ans.isEmpty() ? "/" : ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}