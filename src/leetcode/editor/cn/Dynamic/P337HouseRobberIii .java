package leetcode.editor.cn.Dynamic;

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
        int[] dp = dfs(root);
        return Math.max(dp[0], dp[1]);
    }

    private int[] dfs(TreeNode root){
        //0 no 1 yes
        int[] res = new int[2];
        if(root == null){
            return res;
        }

        int[] l = dfs(root.left);
        int[] r = dfs(root.right);

        res[0] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        res[1] = root.val + l[0] + r[0];

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}