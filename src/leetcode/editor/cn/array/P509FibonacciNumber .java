package leetcode.editor.cn.array;
class P509FibonacciNumber{
    public static void main(String[] args){
        Solution solution = new P509FibonacciNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}