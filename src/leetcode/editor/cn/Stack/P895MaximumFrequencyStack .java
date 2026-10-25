package leetcode.editor.cn.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class P895MaximumFrequencyStack{
    public static void main(String[] args){

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class FreqStack {
    Map<Integer, Stack<Integer>> group;
    Map<Integer, Integer> freq;
    int maxFreq;

    public FreqStack() {
        group = new HashMap<>();
        freq = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        int curFreq = freq.getOrDefault(val, 0) + 1;
        freq.put(val, curFreq);
        maxFreq = Math.max(maxFreq, curFreq);
        Stack<Integer> stack = group.getOrDefault(curFreq, new Stack<>());
        stack.push(val);
        group.put(curFreq, stack);
    }
    
    public int pop() {
        int val = group.get(maxFreq).pop();
        freq.put(val, freq.get(val) - 1);
        if(group.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
//leetcode submit region end(Prohibit modification and deletion)

}