package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P337HouseRobberIii{
    public static void main(String[] args){
        Solution solution = new P337HouseRobberIii().new Solution();
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
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode root){
        //0偷，1不偷
        if(root == null){
            return new int[]{0, 0};
        }
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int[] res = new int[2];
        res[0] = root.val + l[1] + r[1];
        res[1] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}