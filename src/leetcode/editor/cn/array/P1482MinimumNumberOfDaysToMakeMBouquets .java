package leetcode.editor.cn.array;

class P1482MinimumNumberOfDaysToMakeMBouquets{
    public static void main(String[] args){
        Solution solution = new P1482MinimumNumberOfDaysToMakeMBouquets().new Solution();
        int[] bloomDay = {1,10,2,9,3,8,4,7,5,6};
        solution.minDays(bloomDay, 4 ,2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m * k){
            return -1;
        }
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for(int day : bloomDay){
            l = Integer.min(day, l);
            r = Integer.max(day, r);
        }
        while(l < r){
            int mid = l + (r - l) / 2;
            if(canMake(bloomDay, m, k, mid)){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean canMake(int[] bloomDay, int m, int k,int day){
        int count = 0;
        int sum = 0;
        for(int a : bloomDay){
            if(day >= a){
                count++;
            }else {
                count = 0;
            }
            if(count == k){
                count = 0;
                sum++;
            }
            if(sum == m){
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}