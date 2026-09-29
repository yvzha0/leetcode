package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P230KthSmallestElementInABst{
    public static void main(String[] args){
        Solution solution = new P230KthSmallestElementInABst().new Solution();
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
    int ans;
    int count;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.ans = 0;
        this.count = 0;
        this.k = k;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root){
        if(root == null || count >= k){
            return;
        }
        dfs(root.left);
        if (count >= k) {
            return;
        }
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}