package leetcode.editor.cn.string;
class P1108DefangingAnIpAddress{
    public static void main(String[] args){
        Solution solution = new P1108DefangingAnIpAddress().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}