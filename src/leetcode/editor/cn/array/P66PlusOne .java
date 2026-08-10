package leetcode.editor.cn.array;

import java.util.LinkedList;

class P66PlusOne{
    public static void main(String[] args){
        Solution solution = new P66PlusOne().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> stack = new LinkedList<>();
        int jinwei = 0;
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            int a = digits[i] + jinwei;
            if(i == n - 1){
                a++;
            }
            stack.push(a % 10);
            jinwei = a / 10;
        }
        if(jinwei > 0){
            stack.push(jinwei);
        }
        int[] ans = new int[stack.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}