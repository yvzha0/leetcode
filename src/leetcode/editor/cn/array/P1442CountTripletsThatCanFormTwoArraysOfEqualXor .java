package leetcode.editor.cn.array;
class P1442CountTripletsThatCanFormTwoArraysOfEqualXor{
    public static void main(String[] args){
        Solution solution = new P1442CountTripletsThatCanFormTwoArraysOfEqualXor().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] preXor = new int[n];
        preXor[0] = arr[0];
        for(int i = 1; i < n; i++){
            preXor[i] = arr[i] ^ preXor[i - 1];
        }
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            for(int k = i + 1; k < n; k++){
                int a;
                if(i == 0){
                    a = preXor[k];
                }else {
                    a = preXor[k] ^ preXor[i - 1];
                }
                if(a == 0){
                    ans += k - i;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}