package com.dsAlgo.others;
/*
i/p ->(1,3) ,(5,8) (10,13) (15,20) (21,25)
o/p ->(1,3) (5,13) (15,20) (21,25)
i6->interval to be checked with is (7,11)
 */


import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> l = new ArrayList<Interval>();
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(5, 8);
        Interval i3 = new Interval(10, 13);
        Interval i4 = new Interval(15, 20);
        Interval i5 = new Interval(21, 25);
        Interval i6 = new Interval(7, 11);

        l.add(i1);
        l.add(i2);
        l.add(i3);
        l.add(i4);
        l.add(i5);

        List<Interval> res = mergeInterval(l,i6);
        for (Interval r : res) {
            System.out.println(r.start + " " + r.end);
        }
    }

    private static List<Interval> mergeInterval(List<Interval> l, Interval i) {
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

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        System.out.println("(" + this.start + " " + this.end + ")");
        return null;
    }
    
}