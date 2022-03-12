package com.company;

import java.util.*;

public class findRightInterval {
    public int[] findRightInterval(int[][] intervals) {

        List<IntervalIndex> intervalIndexs = new ArrayList<>();
        int len = intervals.length;
        int[] rightIntervalOutput = new int[len];


        for(int i = 0; i < intervals.length; i++){
            intervalIndexs.add(new IntervalIndex(intervals[i][0], intervals[i][1], i));
        }

        Comparator<IntervalIndex> intervalStartIndexComparator = Comparator.comparing(IntervalIndex::getStart);
        Collections.sort(intervalIndexs, intervalStartIndexComparator);


        for(int i = 0; i < len; i++){
            IntervalIndex ithRightIndex = searchMinimisedInterval(intervals[i][1], 0, len - 1, intervalIndexs);

            if(ithRightIndex == null){
                rightIntervalOutput[i] = -1;
            }else{
                rightIntervalOutput[i] = ithRightIndex.index;
            }
        }

        return rightIntervalOutput;
    }

    private IntervalIndex searchMinimisedInterval(int num, int leftIndex, int rightIndex, List<IntervalIndex> intervalIndexs){


        if((rightIndex < leftIndex) || (leftIndex < 0) || (rightIndex >= intervalIndexs.size())){
            return null;
        }

        int mid = (leftIndex + rightIndex)/2;

        if(intervalIndexs.get(mid).start == num){

            return intervalIndexs.get(mid);
        }else if(intervalIndexs.get(mid).start < num){

            return searchMinimisedInterval(num, mid + 1, rightIndex, intervalIndexs);
        }else{
            IntervalIndex leftOutput =  searchMinimisedInterval(num, leftIndex, mid - 1, intervalIndexs);

            if(leftOutput != null){
                return leftOutput;
            }else{
                return intervalIndexs.get(mid);
            }
        }
    }
}
/*
[[3,4],[2,3],[1,2]]
intervalIndexs = [ {1,2,2}, {2,3,1}, {3,4,2}]

*/

class IntervalIndex{
    public int start;
    public int end;
    public int index;

    int getStart(){
        return start;
    }

    public IntervalIndex(int start, int end, int index){
        this.start = start;
        this.end = end;
        this.index = index;
    }
}
