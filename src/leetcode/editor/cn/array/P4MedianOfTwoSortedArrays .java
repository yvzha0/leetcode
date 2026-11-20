package leetcode.editor.cn.array;
class P4MedianOfTwoSortedArrays{
    public static void main(String[] args){
        Solution solution = new P4MedianOfTwoSortedArrays().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int l = 0;
        int r = m;

        while(l <= r){
            int i = l + (r - l) / 2;
            int j = (m + n + 1) / 2 - i;

            int L1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int R1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int L2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int R2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if(L1 <= R2 && L2 <= R1){
                if((m + n) % 2 == 0){
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                }

                return Math.max(L1, L2);
            }else if(L1 > R2){
                r = i - 1;
            }else {
                l = i + 1;
            }
        }

        return 0.0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}