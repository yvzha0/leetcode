package leetcode.editor.cn.array;

import java.util.Arrays;
import java.util.Comparator;

class P870AdvantageShuffle{
    public static void main(String[] args){
        Solution solution = new P870AdvantageShuffle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int n = nums1.length;
        Integer[] idx = new Integer[n];
        for(int i = 0; i < n; i++){
            idx[i] = i;
        }
        Arrays.sort(idx, Comparator.comparingInt(i -> nums2[i]));
        int l = 0;
        int r = n - 1;
        int[] ans = new int[n];
        for (int j : nums1) {
            if (j > nums2[idx[l]]) {
                ans[idx[l]] = j;
                l++;
            } else {
                ans[idx[r]] = j;
                r--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}