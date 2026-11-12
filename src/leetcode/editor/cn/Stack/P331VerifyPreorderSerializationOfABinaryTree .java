package leetcode.editor.cn.Stack;
class P331VerifyPreorderSerializationOfABinaryTree{
    public static void main(String[] args){
        Solution solution = new P331VerifyPreorderSerializationOfABinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int positionNum = 1;
        for(String node : nodes){
            if(positionNum == 0){
                return false;
            }
            positionNum--;
            if(!node.equals("#")){
                positionNum += 2;
            }
        }
        return positionNum == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}