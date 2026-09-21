package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P563BinaryTreeTilt{
    public static void main(String[] args){
        Solution solution = new P563BinaryTreeTilt().new Solution();
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
    int ans;
    public int findTilt(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        ans += Math.abs(l - r);
        return l + r + root.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}