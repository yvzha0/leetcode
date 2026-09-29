package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P235LowestCommonAncestorOfABinarySearchTree{
    public static void main(String[] args){
        Solution solution = new P235LowestCommonAncestorOfABinarySearchTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        if(root.val >= min && root.val <= max){
            return root;
        }
        if(min > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return lowestCommonAncestor(root.left, p, q);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}