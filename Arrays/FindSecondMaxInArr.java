package com.company.Arrays;

public class FindSecondMaxInArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5};
        FindSecondMax(arr);
    }
    static void FindSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int SecondMax = max;

        for (int e : arr
             ) {
            if (e > max){
                SecondMax = max;
                max = e;
            }
            else if (e > SecondMax && e != max){
                SecondMax = e;
            }
        }
        System.out.println(SecondMax);
    }
}
