package leetcode.editor.cn.Tree;

class P1123LowestCommonAncestorOfDeepestLeaves{
    public static void main(String[] args){
        Solution solution = new P1123LowestCommonAncestorOfDeepestLeaves().new Solution();
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
    static class Result{
        private final TreeNode node;
        private final int depth;

        Result(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }

    private Result dfs(TreeNode root){
        if(root == null){
            return new Result(null, 0);
        }

        Result left = dfs(root.left);
        Result right = dfs(root.right);

        if(left.depth > right.depth){
            return new Result(left.node, left.depth + 1);
        }else if(left.depth < right.depth){
            return new Result(right.node, right.depth + 1);
        }else {
            return new Result(root, left.depth + 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}