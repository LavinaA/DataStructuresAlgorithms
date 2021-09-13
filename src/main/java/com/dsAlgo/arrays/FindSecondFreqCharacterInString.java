package com.dsAlgo.arrays;

//WAP to find second most frequent occuring character in string

public class FindSecondFreqCharacterInString {
    public static void main(String[] args) {
        String str = "MADAM";
        findsecondFreequentChar(str);
    }

    private static void findsecondFreequentChar(String str) {
        int arr[] = new int[26];
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            int j = ch - 'A';
            arr[j]++;
        }

        for (int i = 0; i <= 25; i++) {
            int ch = i + 'A';
            Character c = (char)ch;
            System.out.print(c + " ");
            System.out.println(arr[i]);

        }

        //find second max in array

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }else if (arr[i]>smax && arr[i]<fmax){
                smax =arr[i];

            }
        }

        System.out.println(smax);

        //Printing the character where the count is second max
        for(int i =0;i<25;i++){
            if(arr[i]==smax){
                int ch = i + 'A';
                Character c = (char)ch;
                System.out.println(c);

            }
        }



    }
}
