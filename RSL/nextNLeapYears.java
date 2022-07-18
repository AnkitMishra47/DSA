package com.company.RSL;

public class nextNLeapYears {
    public static void main(String[] args) {
        printNextLeap(2013,6);
    }
    static void printNextLeap(int year,int n){
        int leap = 0 ;
        while(true){
         if (isLeap(year)){
            while (leap != n){
                 System.out.print(year+" ");
                 leap++;
                 year = year + 4;
             }
         }
         if (leap == n)break;
         year++ ;
        }
    }
    static boolean isLeap(int year){
        if (year%400==0)return true;
        else if (year%100 == 0 )return false;
        else return year % 4 == 0;
    }
}
