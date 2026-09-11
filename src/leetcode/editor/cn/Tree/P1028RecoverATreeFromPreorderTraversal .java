package leetcode.editor.cn.Tree;

class P1028RecoverATreeFromPreorderTraversal{
    public static void main(String[] args){
        Solution solution = new P1028RecoverATreeFromPreorderTraversal().new Solution();
        solution.recoverFromPreorder("1-2--3---4-5--6---7");
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
    int index;
    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;
        return build(traversal, 0);
    }

    private TreeNode build(String traversal, int depth){
        int n = traversal.length();
        int count = 0;
        int i = index;
        while(i < n && traversal.charAt(i) == '-'){
            count++;
            i++;
        }
        if(count != depth){
            return null;
        }
        index = i;
        int val = 0;
        while(index < n && traversal.charAt(index) != '-'){
            val = val * 10 + traversal.charAt(index) - '0';
            index++;
        }
        TreeNode root = new TreeNode(val);
        root.left = build(traversal, depth + 1);
        root.right = build(traversal, depth + 1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}