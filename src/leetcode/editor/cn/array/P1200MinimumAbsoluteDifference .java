package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P1200MinimumAbsoluteDifference{
    public static void main(String[] args){
        Solution solution = new P1200MinimumAbsoluteDifference().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] - arr[i - 1] < min){
                min = arr[i] - arr[i - 1];
                ans.clear();
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }else if (arr[i] - arr[i - 1] == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}