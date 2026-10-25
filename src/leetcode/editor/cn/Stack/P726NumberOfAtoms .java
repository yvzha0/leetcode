package leetcode.editor.cn.Stack;

import java.util.*;

class P726NumberOfAtoms{
    public static void main(String[] args){
        Solution solution = new P726NumberOfAtoms().new Solution();
        solution.countOfAtoms("Mg(OH)2");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Deque<Map<String, Integer>> stack = new ArrayDeque<>();
        stack.push(new HashMap<>());
        int i = 0;
        while(i < n){
            char c = formula.charAt(i);
            if(c == '('){
                stack.push(new HashMap<>());
                i++;
            }else if(c == ')'){
                Map<String, Integer> top = stack.pop();
                Map<String, Integer> parent = stack.peek();
                int sum = 0;
                i++;
                while(i < n && Character.isDigit(formula.charAt(i))){
                    sum = sum * 10 + formula.charAt(i) - '0';
                    i++;
                }
                if(sum == 0){
                    sum = 1;
                }
                for(String s : top.keySet()){
                    parent.put(s, parent.getOrDefault(s, 0) + top.get(s) * sum);
                }
            }else {
                int start = i++;
                while(i < n && Character.isLowerCase(formula.charAt(i))){
                    i++;
                }
                String atom = formula.substring(start, i);
                int sum = 0;
                while(i < n && Character.isDigit(formula.charAt(i))){
                    sum = sum * 10 + formula.charAt(i) - '0';
                    i++;
                }
                if(sum == 0){
                    sum = 1;
                }
                stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + sum);
            }
        }

        Map<String, Integer> result = new TreeMap<>(stack.pop());
        StringBuilder sb = new StringBuilder();
        for(String s : result.keySet()){
            sb.append(s);
            int num = result.get(s);
            if(num > 1){
                sb.append(num);
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}