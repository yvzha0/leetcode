package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P783MinimumDistanceBetweenBstNodes{
    public static void main(String[] args){
        Solution solution = new P783MinimumDistanceBetweenBstNodes().new Solution();
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
    private int ans = Integer.MAX_VALUE;
    private Integer pre = null;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(pre != null){
            ans = Math.min(ans, Math.abs(pre - root.val));
        }
        pre = root.val;
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}