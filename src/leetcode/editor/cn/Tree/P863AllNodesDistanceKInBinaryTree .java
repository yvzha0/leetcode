package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.ArrayList;
import java.util.List;

class P863AllNodesDistanceKInBinaryTree{
    public static void main(String[] args){
        Solution solution = new P863AllNodesDistanceKInBinaryTree().new Solution();
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
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, target, k);
        return ans;
    }

    // 返回 node 到 target 的距离
    // -1 表示当前子树没有 target
    private int dfs(TreeNode node, TreeNode target, int k) {
        if (node == null) {
            return -1;
        }

        // 找到 target
        if (node == target) {
            // target 往下距离 k
            search(node, k);
            return 1;
        }

        // target 在左子树
        int left = dfs(node.left, target, k);

        if (left != -1) {

            // 当前祖先本身距离 target 为 k
            if (left == k) {
                ans.add(node.val);
            }

            // target -> node -> node.right
            if (left < k) {
                search(node.right, k - left - 1);
            }

            return left + 1;
        }

        // target 在右子树
        int right = dfs(node.right, target, k);

        if (right != -1) {

            if (right == k) {
                ans.add(node.val);
            }

            // target -> node -> node.left
            if (right < k) {
                search(node.left, k - right - 1);
            }

            return right + 1;
        }

        return -1;
    }

    private void search(TreeNode root, int len){
        if(root == null || len < 0){
            return;
        }
        if(len == 0){
            ans.add(root.val);
            return;
        }
        search(root.left, len - 1);
        search(root.right, len - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}