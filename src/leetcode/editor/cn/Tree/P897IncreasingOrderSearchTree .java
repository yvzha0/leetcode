package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P897IncreasingOrderSearchTree{
    public static void main(String[] args){
        Solution solution = new P897IncreasingOrderSearchTree().new Solution();
        TreeNode root = new TreeNode(5);
        TreeNode l = new TreeNode(1);
        TreeNode r = new TreeNode(7);
        root.left = l;
        root.right = r;
        solution.increasingBST(root);
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
    TreeNode pre;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        pre = dummy;
        dfs(root);
        return dummy.right;
    }

    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        pre.right = root;
        root.left = null;
        pre = root;
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}