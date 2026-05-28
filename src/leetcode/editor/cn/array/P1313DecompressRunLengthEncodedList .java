package leetcode.editor.cn.array;

import java.util.Arrays;

class P1313DecompressRunLengthEncodedList{
    public static void main(String[] args){
        Solution solution = new P1313DecompressRunLengthEncodedList().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = nums.length;
        int n = 0;
        for(int i = 0; i < len; i += 2){
            n += nums[i];
        }
        int[] ans = new int[n];
        int pos = 0;
        for(int i = 0; i < len; i += 2){
            int freq = nums[i];
            int val = nums[i + 1];

            // 从 pos 开始，到 pos + freq 结束（左闭右开），全部填入 val
            Arrays.fill(ans, pos, pos + freq, val);

            pos += freq;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}