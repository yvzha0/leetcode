package leetcode.editor.cn.Tree;

import java.util.ArrayList;
import java.util.List;

class P987VerticalOrderTraversalOfABinaryTree{
    public static void main(String[] args){
        Solution solution = new P987VerticalOrderTraversalOfABinaryTree().new Solution();
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();
        dfs(root, 0, 0, nodes);
        nodes.sort((a, b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[2] - b[2];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int col = nodes.get(0)[1];
        ans.add(new ArrayList<>());
        for(int[] node : nodes){
            if(node[1] == col){
                ans.get(ans.size() - 1).add(node[2]);
            }else {
                col = node[1];
                List<Integer> list = new ArrayList<>();
                list.add(node[2]);
                ans.add(list);
            }
        }
        return ans;
    }

    private void dfs(TreeNode root, int row, int col, List<int[]> nodes){
        if(root == null){
            return;
        }
        nodes.add(new int[] {row, col, root.val});
        dfs(root.left, row + 1, col - 1, nodes);
        dfs(root.right, row + 1, col + 1, nodes);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}