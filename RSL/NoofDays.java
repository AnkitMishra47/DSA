package com.company.RSL;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NoofDays {
    static class Date{
        int day ;
        int month ;
        int year ;

        Date(int day , int month , int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    static int[] months = {31,28,31,30,31,30,31,31,30,31,30,31} ;

    static int countOfLeapYear(Date d){
        int year = d.year ;
        if (d.month <=2)year--;

        return year/400 - year/100 + year/4 ;
    }
    static int  noOfDays(Date d1, Date d2){
        int n1 = d1.year*365 + d1.day ;

        for (int i = 0; i < d1.month-1; i++) {
            n1 += months[i];
        }
        n1 += countOfLeapYear(d1);
        int n2 = d2.year*365 + d2.day ;

        for (int i = 0; i < d2.month-1; i++) {
            n2 += months[i];
        }
        n2 += countOfLeapYear(d2);

        return n2-n1;
    }

    public static void main(String[] args) {
        Date d1 = new Date(21 , 1 , 1975);
        Date d2 = new Date(21 , 6 , 2022);

        System.out.println(noOfDays(d1,d2));
        Queue<Integer> q = new LinkedList<>();

    }

}
