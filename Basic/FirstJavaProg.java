package com.company.Basic;
import java.util.Arrays;
import java.util.Scanner;

// class name vhi fila ka name hota h
public class FirstJavaProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = AllocateMinimumNumberOfPages(arr , m);
        System.out.println(ans);
    }
    static int AllocateMinimumNumberOfPages(int[] arr , int k){
        int s = 0 ;
        int sum = 0 ;
        for(int e : arr){
            sum+=e;
        }
        int ans = 0;
        int e = sum;
        while(s<=e){
            int mid = (s+e)/2;
            if(isPossible(arr,k,mid)){
                e = mid-1;
                  ans =  mid;
            }
            else{
                s =mid+1;
            }
        }
        return sum - ans ;
    }
    static boolean isPossible(int[] arr,int m , int mid ){
        int pageSum = 0;
        int studentCount = 1 ;
        for(int i =0  ; i< arr.length ; i++){
            if(pageSum + arr[i] <=mid){
                pageSum+= arr[i];
            }
            else{
                studentCount++;
                if(studentCount > m ||arr[i] > mid )
                    return false;
                pageSum = arr[i];
            }
        }
        return true;

    }
}
