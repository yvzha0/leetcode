package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P385MiniParser{
    public static void main(String[] args){
        Solution solution = new P385MiniParser().new Solution();
        solution.deserialize("[123,[456,[789]]]");
    }
    class NestedInteger {

        // 如果 integer != null，表示当前对象存的是整数
        private Integer integer;

        // 如果 list != null，表示当前对象存的是列表
        private List<NestedInteger> list;

        // 构造一个空列表
        public NestedInteger() {
            this.list = new ArrayList<>();
            this.integer = null;
        }

        // 构造一个整数
        public NestedInteger(int value) {
            this.integer = value;
            this.list = null;
        }

        // 向当前列表添加一个 NestedInteger
        public void add(NestedInteger ni) {
            // 防御性处理：
            // 如果当前原本不是列表，则转换成列表
            if (list == null) {
                list = new ArrayList<>();
                integer = null;
            }

            list.add(ni);
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public NestedInteger deserialize(String s) {
//        if(s.charAt(0) != '['){
//            return new NestedInteger(Integer.parseInt(s));
//        }
//        Deque<NestedInteger> stack = new ArrayDeque<>();
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if(c == '['){
//                stack.push(new NestedInteger());
//            }else if(c == ']'){
//                NestedInteger cur = stack.pop();
//                if(!stack.isEmpty()){
//                    stack.peek().add(cur);
//                }else {
//                    return cur;
//                }
//            }else if(c == ','){
//                continue;
//            }else {
//                int sign = 1;
//                if(c == '-'){
//                    sign = -1;
//                    i++;
//                }
//                int num = 0;
//                while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//                    num = num * 10 + s.charAt(i) - '0';
//                    i++;
//                }
//                i--;
//
//                stack.peek().add(new NestedInteger(sign * num));
//            }
//        }
//        return null;
//    }
    int index = 0;
    public NestedInteger deserialize(String s) {
        if(s.charAt(index) == '['){
            index++;
            NestedInteger ni = new NestedInteger();
            while(s.charAt(index) != ']'){
                ni.add(deserialize(s));
                if(s.charAt(index) == ','){
                    index++;
                }
            }
            index++;
            return ni;
        }else {
            int sign = 1;
            if(s.charAt(index) == '-'){
                index++;
                sign = -1;
            }
            int num = 0;
            while(index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                num = num * 10 + s.charAt(index) - '0';
                index++;
            }
            return new NestedInteger(sign * num);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}