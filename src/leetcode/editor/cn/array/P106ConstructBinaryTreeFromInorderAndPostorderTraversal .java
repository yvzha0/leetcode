package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P106ConstructBinaryTreeFromInorderAndPostorderTraversal{
    public static void main(String[] args){
        Solution solution = new P106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        postIndex = postorder.length - 1;
        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build (int[] postorder, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postIndex--]);
        int rootIndex = map.get(root.val);
        root.right = build(postorder, rootIndex + 1, end);
        root.left = build(postorder, start, rootIndex - 1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}