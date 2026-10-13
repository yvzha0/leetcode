package leetcode.editor.cn.TwoPointers;
class P838PushDominoes{
    public static void main(String[] args){
        Solution solution = new P838PushDominoes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int i = -1;
        char left = 'L';
        int n = arr.length;

        for(int j = 0; j <= n; j++){
            char right = j == n ? 'R' : arr[j];
            if(right == '.'){
                continue;
            }
            if(left == right){
                for(int k = i + 1; k < j; k++){
                    arr[k] = left;
                }
            }else if(left == 'R' && right == 'L'){
                int l = i + 1;
                int r = j - 1;
                while(l < r){
                    arr[l++] = 'R';
                    arr[r--] = 'L';
                }
            }
            left = right;
            i = j;
        }
        return new String(arr);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}