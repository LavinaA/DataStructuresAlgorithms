package com.dsAlgo.arrays;

//Move all negative elements to one side of the array.Func (arr,num) ->here number will be 0;
//The prob statement can also be redefined as move all the moveallElements(arr,num) ,move all elements smaller than the
//mentioned number to one side of the array and larger than that number to other side
//
public class MoveNegativeElementstoOneSideOfArray {
    public static void main(String[] args) {

        int arr[] = {5, 6, -3, -5, 9, -15, 67, 35, -28};
        int num = 0;
        moveElementstoOneSide(arr, num);

    }

    private static void moveElementstoOneSide(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp;
            if (arr[start] < num) {
                start++;
            } else if (arr[end] > num) {
                end--;
            }
               else if (arr[start] >= num && arr[end] <= num) {
                    temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

 }
