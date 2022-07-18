package com.company;

public class Surya {
   static class Time{
       int h ;
       int m ;


       public Time(int h, int m , String str) {
           h = h%12 ;
           if (str.equals("AM")) {
               this.h = h;
           }
           else{

               this.h = h+12;
           }
           this.m = m;
       }
   }

   static int getDiffBwTime(Time t1 , Time t2){
       int h = 0 ;
       if(t1.h > t2.h){
           h = Math.min(t1.h - t2.h , 24-t1.h+t2.h);
       }
       else{
           h = Math.min(t2.h - t1.h , 24-t2.h+t1.h);
       }
       int m = Math.abs(t1.m - t2.m);

       return (h*60 + m);
   }

  static int getFreeTime(String[] time){
       int max = 0 ;

      for (int i = 0; i <time.length-1 ; i++) {

//           max  = Math.max(max , getAns(time[i] , time[i+1]));

      }
       return max ;
  }





    public static void main(String[] args) {
     String[] arr = {"10:00 AM - 12:30 PM" ,"02:00 PM - 02:45 PM" ,"09:10 AM - 09:50 AM"};

    }
}
