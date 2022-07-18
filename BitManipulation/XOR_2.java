package com.company.BitManipulation;

public class XOR_2 {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,7,7,1,8};
        int res = 0;
        for (int i = 0; i <arr.length ; i++) {
            res = res^arr[i];
        }
        int count =0;
        while (res!=0){
            if ((res&1)!= 0){
                break;
            }
            count++;
            res = res >> 1;
        }
        int c =(res & ~(res-1)) ;
        System.out.println( count);
        System.out.println(c);
        int a = 0 ;
        int b = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if ((c & arr[i]) != 1){
                a =a^arr[i];
            }
            else {
                b = b^arr[i];
            }
        }
        System.out.println(a +" "+ b);
    }
    static boolean checkBit(int pos , int num){
        int mask = 1<<pos;
        return (num&mask) == 0;
    }
}
