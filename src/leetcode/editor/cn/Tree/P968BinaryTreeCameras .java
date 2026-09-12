package leetcode.editor.cn.Tree;

class P968BinaryTreeCameras{
    public static void main(String[] args){
        Solution solution = new P968BinaryTreeCameras().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minCameraCover(TreeNode root) {
        int[] dp = dfs(root);
        return Math.min(dp[0], dp[1]);
    }

    private int[] dfs(TreeNode root){
        if(root == null){
            return new int[] {100000000, 0, 0};
        }
        int[] L = dfs(root.left);
        int[] R = dfs(root.right);
        int[] res = new int[3];
        // 装摄像头，孩子装不装都行
        res[0] = Math.min(L[0], Math.min(L[1], L[2])) + Math.min(R[0], Math.min(R[1], R[2])) + 1;
        // 不装，被孩子覆盖， 孩子至少有一个装了，并且都被覆盖了
        res[1] = Math.min(L[0] + R[0], Math.min(L[0] + R[1], L[1] + R[0]));
        // 不装，被父亲覆盖，那么孩子都没装
        res[2] = L[1] + R[1];

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}