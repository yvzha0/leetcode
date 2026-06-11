package leetcode.editor.cn.array;
class P1011CapacityToShipPackagesWithinDDays{
    public static void main(String[] args){
        Solution solution = new P1011CapacityToShipPackagesWithinDDays().new Solution();
        solution.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int maxWeight = Integer.MIN_VALUE;
        for(int weight : weights){
            sum += weight;
            maxWeight = Math.max(maxWeight, weight);
        }
        int l = maxWeight;
        int r = sum;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(canDo(weights, days, mid)){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return r;
    }
    private boolean canDo(int[] weights, int days, int weight){
        int count = 1;
        int sum = 0;
        for (int j : weights) {
            sum += j;
            if (sum > weight) {
                count++;
                sum = j;
            }
            if (count > days) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}