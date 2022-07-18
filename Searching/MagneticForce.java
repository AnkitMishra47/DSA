package com.company.Searching;

import java.util.Arrays;

public class MagneticForce {
    public static void main(String[] args) {
        int[] arr = {79, 74, 57, 22};

        System.out.println(FindmaxDist(arr, 4));
    }

    static int FindmaxDist(int[] arr, int m) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr[arr.length - 1] - arr[0];
        int count = 0;
        int ans = -1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (isValid(arr, m, mid)) {
                s = mid + 1;
                ans = mid;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    static boolean isValid(int[] arr, int m, int gap) {
        int place = 1;
        int prev = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[prev] >= gap) {
                place++;
                prev = i;
                  if(place == m)
                      return true;
            }
        }
       return false;
    }
}