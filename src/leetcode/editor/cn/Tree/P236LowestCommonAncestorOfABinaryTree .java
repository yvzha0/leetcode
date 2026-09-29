package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

class P236LowestCommonAncestorOfABinaryTree{
    public static void main(String[] args){
        Solution solution = new P236LowestCommonAncestorOfABinaryTree().new Solution();
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
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Map<TreeNode, TreeNode> map = new HashMap<>();
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.offer(root);
//        map.put(root, null);
//        while(!map.containsKey(p) || !map.containsKey(q)){
//            TreeNode node = queue.poll();
//            if(node.left != null){
//                queue.offer(node.left);
//                map.put(node.left, node);
//            }
//            if(node.right != null){
//                queue.offer(node.right);
//                map.put(node.right, node);
//            }
//        }
//        Set<TreeNode> set = new HashSet<>();
//        while(p != null){
//            set.add(p);
//            p = map.get(p);
//        }
//        while(!set.contains(q)){
//            q = map.get(q);
//        }
//        return q;
//    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        return left == null ? right : left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}