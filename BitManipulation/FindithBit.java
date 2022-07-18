package com.company.BitManipulation;

public class FindithBit {
    public static void main(String[] args) {
        int n = 12;
        int numberBit = (int) (Math.log(n)/Math.log(2)) +1;
        int i = 1;
        int mask = 1<<i;
        if((mask&n) == 0 ){
            System.out.println("0");
        }
        else {
            System.out.println(1);
        }
    }
}
