class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       if(intervals == null || intervals.length <= 1 ) return 0;

       Arrays.sort(intervals,(a,b) -> Integer.compare(a[1], b[1]));

       int removals =0;
       int lastEnd = intervals[0][1];

       for(int i = 1; i <intervals.length;i++){
        int start = intervals[i][0];
        int end = intervals[i][1];

        if(start >= lastEnd){
            lastEnd = end;
        }
        else{
            removals++;
        }
       }
       return removals;
    }
}