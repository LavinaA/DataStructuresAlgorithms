package com.dsAlgo.others;
/*
i/p ->(1,3) ,(5,8) (10,13) (15,20) (21,25)
o/p ->(1,3) (5,13) (15,20) (21,25)
i6->interval to be checked with is (7,11)

 fsAaAaaaaa*/


import java.util.ArrayList;
import java.util.List;

public class MergeIntervalsWithArray {
    public static void main(String[] args) {

        int[][] _2Arr = {
                {1, 3},
                {5, 8},
                {10, 13},
                {15, 20},
                {21, 25},
        };

        int[] arr = {7, 11};

        List<Interval> res = mergeInterval(_2Arr, arr);
        for (Interval r : res) {
            System.out.println(r.start + " " + r.end);
        }
    }

    private static List<Interval> mergeInterval(int[][] _2dArr, int[] arr) {

        List<Interval> l = new ArrayList<Interval>();

        for (int count = 0; count < _2dArr.length; count++) {
            int[] subArr = _2dArr[count];
            Interval interval = new Interval(subArr[0], subArr[1]);
            l.add(interval);
        }

        Interval i = new Interval(arr[0], arr[1]);



        List<Interval> before = new ArrayList<Interval>();
        List<Interval> overlap = new ArrayList<Interval>();
        List<Interval> after = new ArrayList<Interval>();

        for (Interval in : l) {
            if (in.end < i.start) {
                before.add(in);
            } else if (i.end < in.start) {
                after.add(in);
            } else {
                overlap.add(in);
            }
        }
        Interval mergecell = null;
        if (!overlap.isEmpty()) {
            int min = Math.min(overlap.get(0).start, i.start);
            int max = Math.max(overlap.get(overlap.size() - 1).end, i.end);
            mergecell = new Interval(min, max);
        } else {
            mergecell = i;
        }
        List<Interval> res = new ArrayList<Interval>();
        res.addAll(before);
        res.add(mergecell);
        res.addAll(after);

        return res;
    }
}

