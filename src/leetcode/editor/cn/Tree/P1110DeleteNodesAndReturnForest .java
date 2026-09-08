package leetcode.editor.cn.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class P1110DeleteNodesAndReturnForest{
    public static void main(String[] args){
        Solution solution = new P1110DeleteNodesAndReturnForest().new Solution();
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
    Set<Integer> set = new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int a : to_delete){
            set.add(a);
        }
        List<TreeNode> ans = new ArrayList<>();
        dfs(root, ans, true);
        return ans;
    }

    private TreeNode dfs(TreeNode root, List<TreeNode> ans, boolean isRoot){
        if(root == null){
            return null;
        }
        boolean isDelete = set.contains(root.val);

        if(isRoot && !isDelete){
            ans.add(root);
        }

        root.left = dfs(root.left, ans, isDelete);
        root.right = dfs(root.right, ans, isDelete);

        return isDelete ? null : root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}