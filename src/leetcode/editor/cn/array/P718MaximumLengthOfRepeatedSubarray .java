package leetcode.editor.cn.array;

class P718MaximumLengthOfRepeatedSubarray{
    public static void main(String[] args){
        Solution solution = new P718MaximumLengthOfRepeatedSubarray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        int[][] dp = new int[m][n];
        if(nums1[0] == nums2[0]){
            dp[0][0] = 1;
            ans = 1;
        }
        for(int i = 1; i < m; i++){
            if(nums1[i] == nums2[0]){
                dp[i][0] = 1;
                ans = 1;
            }else {
                dp[i][0] = 0;
            }
        }

        for(int i = 1; i < n; i++){
            if(nums1[0] == nums2[i]){
                dp[0][i] = 1;
                ans = 1;
            }else {
                dp[0][i] = 0;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(nums1[i] == nums2[j]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }else {
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }

//    public int findLength(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        int m = nums2.length;
//        int ans = 0;
//
//        // 阶段 1：nums1 固定，nums2 的头部从 nums1 的各个位置开始往后匹配
//        for (int i = 0; i < n; i++) {
//            int len = Math.min(m, n - i);
//            int maxLen = maxLength(nums1, nums2, i, 0, len);
//            ans = Math.max(ans, maxLen);
//        }
//
//        // 阶段 2：nums2 固定，nums1 的头部从 nums2 的各个位置开始往后匹配
//        // 注意：j 从 1 开始即可，因为 j = 0 的情况在上面 i = 0 时已经计算过了（都是两数组头部对齐）
//        for (int j = 1; j < m; j++) {
//            int len = Math.min(n, m - j);
//            int maxLen = maxLength(nums1, nums2, 0, j, len);
//            ans = Math.max(ans, maxLen);
//        }
//
//        return ans;
//    }
//    private int maxLength(int[] nums1, int[] nums2, int add1, int add2, int len){
//        int res = 0;
//        int currentLen = 0;
//        for (int i = 0; i < len; i++){
//            if(nums1[add1 + i] == nums2[add2 + i]){
//                currentLen++;
//                res = Math.max(res, currentLen);
//            }else {
//                currentLen = 0;
//            }
//        }
//        return res;
//    }
}


//leetcode submit region end(Prohibit modification and deletion)

}