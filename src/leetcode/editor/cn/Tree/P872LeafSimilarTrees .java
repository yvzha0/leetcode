package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class P872LeafSimilarTrees{
    public static void main(String[] args){
        Solution solution = new P872LeafSimilarTrees().new Solution();
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        f(root1, list1);
        f(root2, list2);
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if(!Objects.equals(list1.get(i), list2.get(i))){
                return false;
            }
        }
        return true;
    }

    private void f(TreeNode root, List<Integer> list){
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        if (root.left != null) {
            f(root.left, list);
        }
        if (root.right != null) {
            f(root.right, list);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}