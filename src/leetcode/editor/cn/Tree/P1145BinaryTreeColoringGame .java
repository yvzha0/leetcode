package leetcode.editor.cn.Tree;

class P1145BinaryTreeColoringGame{
    public static void main(String[] args){
        Solution solution = new P1145BinaryTreeColoringGame().new Solution();
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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        int total = count(root);
        TreeNode xNode = findX(root, x);
        int l = count(xNode.left);
        int r = count(xNode.right);
        return total - l - r - 1 > n / 2 || l > n / 2 || r > n / 2;
    }

    private TreeNode findX(TreeNode root, int x){
        if(root == null){
            return null;
        }
        if(root.val == x){
            return root;
        }
        TreeNode a = findX(root.left, x);
        if(a != null){
            return a;
        }
        return findX(root.right, x);
    }

    private int count(TreeNode root){
        if(root == null){
            return 0;
        }
        return count(root.right) + count(root.left) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}