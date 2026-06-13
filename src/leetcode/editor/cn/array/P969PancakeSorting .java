package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P969PancakeSorting{
    public static void main(String[] args){
        Solution solution = new P969PancakeSorting().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for(int i = arr.length - 1; i > 0; i--){
            int index = 0;
            int max = 0;
            for(int j = 0; j <= i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            if(index != i){
                ans.add(index + 1);
                ans.add(i + 1);
                reverse(arr, index);
                reverse(arr, i);
            }
        }
        return ans;
    }

    private void reverse(int[] arr, int index){
        int i = 0;
        while(i < index){
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
            i++;
            index--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}