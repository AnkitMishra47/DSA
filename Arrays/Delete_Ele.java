package com.company.Arrays;

import java.util.Arrays;

public class Delete_Ele {
    static int[] removeEven(int[] arr ){
        int oddElements = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2!=0)
                oddElements++;
        }
        int[] newArr = new int[oddElements];
        for (int i = 0,j=0; i <arr.length ; i++)
        {
            if (arr[i]%2 != 0){
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        arr = removeEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
