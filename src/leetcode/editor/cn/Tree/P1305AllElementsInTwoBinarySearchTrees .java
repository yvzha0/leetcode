package leetcode.editor.cn.Tree;

import java.util.ArrayList;
import java.util.List;

class P1305AllElementsInTwoBinarySearchTrees{
    public static void main(String[] args){
        Solution solution = new P1305AllElementsInTwoBinarySearchTrees().new Solution();
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        int i = 0;
        int j = 0;
        while(i < list1.size() || j < list2.size()){
            if(i < list1.size() && j < list2.size()){
                if(list1.get(i) < list2.get(j)){
                    ans.add(list1.get(i));
                    i++;
                }else {
                    ans.add(list2.get(j));
                    j++;
                }
            }else if(i < list1.size()){
                ans.add(list1.get(i));
                i++;
            }else {
                ans.add(list2.get(j));
                j++;
            }
        }
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}