package leetcode.editor.cn.Tree;

class P993CousinsInBinaryTree{
    public static void main(String[] args){
        Solution solution = new P993CousinsInBinaryTree().new Solution();
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
    static class Result{
        private final TreeNode father;
        private final int depth;

        Result(TreeNode father, int depth){
            this.father = father;
            this.depth = depth;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y){
            return false;
        }
        Result resultx = find(root, x, null, 0);
        Result resulty = find(root, y, null, 0);
        return resultx.depth == resulty.depth && !resulty.father.equals(resultx.father);
    }

    private Result find(TreeNode root, int val, TreeNode father, int depth){
        if(root == null){
            return new Result(null, -1);
        }
        if(root.val == val){
            return new Result(father, depth);
        }
        Result l = find(root.left, val, root, depth + 1);
        if(l.depth != -1){
            return l;
        }
        return find(root.right, val, root, depth + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}