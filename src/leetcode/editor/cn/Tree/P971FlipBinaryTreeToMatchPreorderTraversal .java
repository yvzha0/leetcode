package leetcode.editor.cn.Tree;

import java.util.ArrayList;
import java.util.List;

class P971FlipBinaryTreeToMatchPreorderTraversal{
    public static void main(String[] args){
        Solution solution = new P971FlipBinaryTreeToMatchPreorderTraversal().new Solution();
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
    int index = 0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> ans = new ArrayList<>();
        if(dfs(root, voyage, ans)){
            return ans;
        }
        return List.of(-1);
    }

    private boolean dfs(TreeNode root, int[] voyage, List<Integer> ans){
        if(root == null){
            return true;
        }
        if(index >= voyage.length || root.val != voyage[index]){
            return false;
        }
        index++;
        if(root.left != null && root.left.val != voyage[index]){
            ans.add(root.val);
            return dfs(root.right, voyage, ans) && dfs(root.left, voyage, ans);
        }

        return dfs(root.left, voyage, ans) && dfs(root.right, voyage, ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}