package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P538ConvertBstToGreaterTree{
    public static void main(String[] args){
        Solution solution = new P538ConvertBstToGreaterTree().new Solution();
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
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        replace(root);
        return root;
    }

    private void replace(TreeNode root){
        if(root == null){
            return;
        }
        replace(root.right);
        sum += root.val;
        root.val = sum;
        replace(root.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}