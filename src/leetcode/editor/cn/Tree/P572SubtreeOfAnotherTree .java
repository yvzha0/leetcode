package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P572SubtreeOfAnotherTree{
    public static void main(String[] args){
        Solution solution = new P572SubtreeOfAnotherTree().new Solution();
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return subRoot == null;
        }
        if(root.val == subRoot.val && isSame(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}