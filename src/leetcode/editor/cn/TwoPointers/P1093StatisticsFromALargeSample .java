package leetcode.editor.cn.TwoPointers;
class P1093StatisticsFromALargeSample{
    public static void main(String[] args){
        Solution solution = new P1093StatisticsFromALargeSample().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] sampleStats(int[] count) {
        double[] ans = new double[5];
        int i = 0;
        int j = 255;
        double num = 0;
        int max = 0;
        while(count[i] == 0){
            i++;
        }
        while(count[j] == 0){
            j--;
        }
        ans[0] = i;
        ans[1] = j;
        while(i <= j){
            num += count[i];
            if(count[i] > max){
                max = count[i];
                ans[4] = i;
            }
            i++;
        }
        i = (int) ans[0];
        j = (int) ans[1];
        while(i <= j){
            ans[2] += i / num * count[i];
            i++;
        }
        if(num % 2 == 0){
            int mid = (int) (num / 2);
            i = (int) ans[0];
            j = (int) ans[1];
            int cnt = 0;
            while(i <= j){
                cnt += count[i];
                if(cnt > mid){
                    ans[3] = i;
                    break;
                }else if(cnt == mid){
                    int a = i;
                    i++;
                    while(count[i] == 0){
                        i++;
                    }
                    ans[3] = (double) (a + i) / 2;
                    break;
                }
                i++;
            }
        }else {
            int mid = (int) (num / 2) + 1;
            i = (int) ans[0];
            j = (int) ans[1];
            int cnt = 0;
            while(i <= j){
                cnt += count[i];
                if(cnt >= mid){
                    ans[3] = i;
                    break;
                }
                i++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}