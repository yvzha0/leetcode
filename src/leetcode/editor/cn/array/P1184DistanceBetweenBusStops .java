package leetcode.editor.cn.array;

class P1184DistanceBetweenBusStops{
    public static void main(String[] args){
        Solution solution = new P1184DistanceBetweenBusStops().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        int sum1 = 0;
        int sum2 = 0;
        int n = distance.length;
        for(int i = 0; i < n; i++){
            if(i < start || i >= destination){
                sum1 += distance[i];
            }else {
                sum2 += distance[i];
            }
        }
        return Math.min(sum1, sum2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}