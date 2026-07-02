package leetcode.editor.cn.array;

import java.util.TreeMap;

class P729MyCalendarI{
    public static void main(String[] args){
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MyCalendar {
    private final TreeMap<Integer, Integer> calendar;
    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        Integer prevStart = calendar.floorKey(startTime);
        if(prevStart != null && calendar.get(prevStart) > startTime){
            return false;
        }
        Integer nextStart = calendar.ceilingKey(startTime);
        if(nextStart != null && nextStart < endTime){
            return false;
        }

        calendar.put(startTime, endTime);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
//leetcode submit region end(Prohibit modification and deletion)

}