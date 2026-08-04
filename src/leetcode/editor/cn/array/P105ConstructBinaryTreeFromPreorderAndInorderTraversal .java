package leetcode.editor.cn.array;

import java.util.HashMap;
import java.util.Map;

class P105ConstructBinaryTreeFromPreorderAndInorderTraversal{
    public static void main(String[] args){
        Solution solution = new P105ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        postIndex = 0;
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build (int[] preorder, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[postIndex++]);
        int rootIndex = map.get(root.val);
        root.left = build(preorder, start, rootIndex - 1);
        root.right = build(preorder, rootIndex + 1, end);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}