package leetcode.editor.cn.array;
class P1700NumberOfStudentsUnableToEatLunch{
    public static void main(String[] args){
        Solution solution = new P1700NumberOfStudentsUnableToEatLunch().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int love0 = 0;
        int love1 = 0;
        for(int student : students){
            if(student == 0){
                love0++;
            }
            else {
                love1++;
            }
        }
        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(love0 > 0){
                    love0--;
                }else {
                    return love1;
                }
            }else {
                if(love1 > 0){
                    love1--;
                }else {
                    return love0;
                }
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}