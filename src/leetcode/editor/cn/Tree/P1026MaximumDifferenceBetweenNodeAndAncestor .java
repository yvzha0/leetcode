package leetcode.editor.cn.Tree;

class P1026MaximumDifferenceBetweenNodeAndAncestor{
    public static void main(String[] args){
        Solution solution = new P1026MaximumDifferenceBetweenNodeAndAncestor().new Solution();
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
    public int maxAncestorDiff(TreeNode root) {
        return Math.max(dfs(root.left, root.val, root.val), dfs(root.right, root.val, root.val));
    }

    private int dfs(TreeNode root, int min, int max){
        if(root == null){
            return 0;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        return Math.max(Math.max(dfs(root.left, min, max), dfs(root.right, min, max)), Math.max(Math.abs(root.val - min), Math.abs(root.val - max)));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}