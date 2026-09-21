package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P623AddOneRowToTree{
    public static void main(String[] args){
        Solution solution = new P623AddOneRowToTree().new Solution();
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            return new TreeNode(val, root, null);
        }
        dfs(root, val, 1, depth - 1);
        return root;
    }

    private void dfs(TreeNode root, int val, int curDepth, int targetDepth){
        if(root == null){
            return;
        }
        if(curDepth == targetDepth){
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
            return;
        }
        dfs(root.left, val, curDepth + 1, targetDepth);
        dfs(root.right, val, curDepth + 1, targetDepth);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}