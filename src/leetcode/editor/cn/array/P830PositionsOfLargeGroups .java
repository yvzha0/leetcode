package leetcode.editor.cn.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class P830PositionsOfLargeGroups{
    public static void main(String[] args){
        Solution solution = new P830PositionsOfLargeGroups().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = s.length();
        int start = 0;
        for(int i = 0; i <= n; i++){
            if(i == n || s.charAt(i) != s.charAt(start)){
                if(i - start >= 3){
                    ans.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}