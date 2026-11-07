package leetcode.editor.cn.Dynamic;

import leetcode.editor.cn.TreeNode;

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
    //0:当前节点安装; 1:当前不安，但是孩子安; 2:当前不安，但是父亲安
    public int minCameraCover(TreeNode root) {
        int[] a = dfs(root);
        return Math.min(a[0], a[1]);
    }

    private int[] dfs(TreeNode root){
        if(root == null){
            return new int[] {10000000, 0, 0};
        }
        int[] L = dfs(root.left);
        int[] R = dfs(root.right);
        int[] res = new int[3];

        res[0] = Math.min(L[0], Math.min(L[1], L[2])) + Math.min(R[0], Math.min(R[1], R[2])) + 1;

        res[1] = Math.min(L[0] + R[0] , Math.min(L[1] + R[0], L[0] + R[1]));

        res[2] = L[1] + R[1];

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}