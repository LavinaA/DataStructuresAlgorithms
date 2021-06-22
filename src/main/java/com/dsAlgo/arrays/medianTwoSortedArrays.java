package com.dsAlgo.arrays;

public class medianTwoSortedArrays {
    public static void main(String[] args) {
        int ar[] = {1,12,15,26,38,89,90};
        int br[] = {2,13,17,30,45};

        double median = findMedian(ar, br);
        System.out.println("The value of median is "+median);
    }

    private static double findMedian(int[] ar, int[] br) {
        int i = 0, j = 0, k = 0;

        int arlength = ar.length;
        int brlength = br.length;
        int reslength = arlength + brlength;
        int res[] = new int[reslength];

        int min =Math.min(arlength-1,brlength-1);
        double median = 0;

        while (i <= arlength && j <= brlength) {

            if (ar[i] > br[j]) {
                res[k] = br[j];
                k++;
                j++;
            } else {
                res[k] = ar[i];
                i++;
                k++;
            }
            /*if (i == min || j == min) {
                break;
            }*/
        }

        System.out.println(i + "," + j);

        while (i <= arlength || j <= brlength) {
            if (arlength > brlength) {
                res[k] = ar[i];
                i++;
                k++;
            } else if (brlength > arlength) {
                res[k] = br[j];
                j++;
                k++;
            }
        }

        for (int p = 0; p < res.length; p++) {
            System.out.println(res[p]);
        }

        if (reslength % 2 == 0) {

             median = res[reslength/2] + res[reslength+2/2];
        }
        else{    median = res[reslength/2];

        }
        return median;
    }
}
