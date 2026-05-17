package leetcode.editor.cn.array;

import java.util.Arrays;

class P1619MeanOfArrayAfterRemovingSomeElements{
    public static void main(String[] args){
        Solution solution = new P1619MeanOfArrayAfterRemovingSomeElements().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int a = (int) (n * 0.05);
        int sum = 0;
        Arrays.sort(arr);
        for(int i = a;i < n - a;i++){
            sum += arr[i];
        }
        return (double) sum / (n - 2 * a);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}