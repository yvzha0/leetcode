package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class P901OnlineStockSpan{
    public static void main(String[] args){
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class StockSpanner {
    Deque<Integer> stack;
    List<Integer> list;
    int i = 0;
    public StockSpanner() {
        stack = new ArrayDeque<>();
        stack.push(-1);
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(stack.size() > 1 && list.get(stack.peek()) <= price){
            stack.pop();
        }
        int res = i - stack.peek();
        stack.push(i++);
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//leetcode submit region end(Prohibit modification and deletion)

}