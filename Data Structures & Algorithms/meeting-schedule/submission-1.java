/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */


class Solution {

    public boolean canAttendMeetings(List<Interval> intervals) {
        // first sort all the intervals using interval start time 
        Collections.sort(intervals, Comparator.comparingInt(i->i.start));

        // loop through all the intervals. for each iteraction check the current interval endtime > next interval start time 
        // if yes return false else return true 
        for (int i=1; i< intervals.size(); i++){

            int firstIntervalEndTime = intervals.get(i-1).end;
            int nextIntervalStartTime = intervals.get(i).start;
            if(firstIntervalEndTime > nextIntervalStartTime)
            {
                return false;

            }
        }
        return true;
    }
}
