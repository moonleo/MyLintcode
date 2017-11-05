/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */


public class Solution {
    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        List<Interval> result = new ArrayList<Interval>();
		int i = 0;
		boolean addNew = false;
		while (i < intervals.size()) {
			if (intervals.get(i).end < newInterval.start) {
				result.add(intervals.get(i));
			} else if (intervals.get(i).start > newInterval.end) {
				if (!addNew) {
					result.add(newInterval);
					addNew = true;
				}
				result.add(intervals.get(i));
			} else {
				newInterval.start = min(newInterval.start,
						intervals.get(i).start);
				newInterval.end = max(newInterval.end, intervals.get(i).end);
			}
			i++;
		}
		if (!addNew) {
			result.add(newInterval);
		}
		return result;
    }

    public int min(int a, int b) {
        return a > b? b: a;
    }

    public int max(int a, int b) {
        return a > b? a: b;
    }
}
