package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class P257BinaryTreePaths{
    public static void main(String[] args){
        Solution solution = new P257BinaryTreePaths().new Solution();
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
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> ans = new ArrayList<>();
//        if(root == null){
//            return ans;
//        }
//        if(root.left == null && root.right == null){
//            ans.add(String.valueOf(root.val));
//            return ans;
//        }
//        List<String> list1 = binaryTreePaths(root.left);
//        List<String> list2 = binaryTreePaths(root.right);
//
//        for(String s : list1){
//            ans.add(root.val + "->" + s);
//        }
//
//        for(String s : list2){
//            ans.add(root.val + "->" + s);
//        }
//
//        return ans;
//
//    }
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> ans = new ArrayList<>();
//
//        if(root == null){
//            return ans;
//        }
//
//        backtrace(root, ans, new StringBuilder());
//
//        return ans;
//    }
//    private void backtrace(TreeNode root, List<String> ans, StringBuilder path){
//        int len = path.length();
//        if(len > 0){
//            path.append("->");
//        }
//        path.append(root.val);
//        if(root.left == null && root.right == null){
//            ans.add(path.toString());
//        }else {
//            if(root.left != null){
//                backtrace(root.left, ans, path);
//            }
//            if(root.right != null){
//                backtrace(root.right, ans, path);
//            }
//        }
//        path.setLength(len);
//    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        Deque<String> pathQueue = new ArrayDeque<>();

        nodeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.val));

        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();
            if(node.left == null && node.right == null){
                ans.add(path);
            }else {
                if(node.left != null){
                    nodeQueue.offer(node.left);
                    pathQueue.offer(path + "->" + node.left.val);
                }
                if(node.right != null){
                    nodeQueue.offer(node.right);
                    pathQueue.offer(path + "->" + node.right.val);
                }
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}