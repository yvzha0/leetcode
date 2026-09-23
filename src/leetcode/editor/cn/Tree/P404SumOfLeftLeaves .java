package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P404SumOfLeftLeaves{
    public static void main(String[] args){
        Solution solution = new P404SumOfLeftLeaves().new Solution();
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
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode root){
        int ans = 0;
        if(root.left != null){
            if(isLeaf(root.left)){
                ans += root.left.val;
            }else {
                ans += dfs(root.left);
            }
        }
        if(root.right != null){
            ans += dfs(root.right);
        }
        return ans;
    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}