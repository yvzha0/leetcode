package leetcode.editor.cn.Tree;

class P938RangeSumOfBst{
    public static void main(String[] args){
        Solution solution = new P938RangeSumOfBst().new Solution();
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        if(root == null){
            return 0;
        }
        if(root.val < low){
            return rangeSumBST(root.right, low, high);
        }
        if(root.val > high){
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}