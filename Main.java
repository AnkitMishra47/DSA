package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,89,0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                list.add(arr[j-1]);
            }
            System.out.println(list);
        }
    }
}
