package com.company.StringsPrac;

import java.util.ArrayDeque;

public class EvaluateExp {

    // String numbers to convert given string to numbers.
    static String[] number = {"zero" , "one" , "two" , "three" , "four" , "five" , "six", "seven" , "eight", "nine"};

    // function for converting words to string.
    static int getNumber(String str){
        for (int i = 0; i <number.length ; i++) {
            if (str.equals(number[i])){
                return i ;
            }
        }
        return -1;
    }

    // func to evaluate the whole expression
    static int getAns(String str){

        String ans = "";
        int val = 0 ;
        int sum = 0 ;
        //creating a queue to handle the '+' and '-' operator.
        ArrayDeque<Integer> q = new ArrayDeque<>();

        
        for (int i = 0; i <str.length() ; i++) {

            ans += str.charAt(i);
            if (getNumber(ans)!= -1){
                val = val*10 + getNumber(ans) ;   // storing the integer in a variable
                ans = ""; // resetting the string
            }
           else if (ans.equals("plus")){
               // popping value into queue if it's not the first element.
               if (!q.isEmpty()){
                   if (q.poll() == 1){  // 1 --> '+'
                       sum += val ;
                   }
                   else{
                       sum -=val ;
                   }
               }
               else {
                   sum = val;  //
               }
                q.offer(1);
                val = 0 ;
                ans = "" ;
            }
           else if(ans.equals("minus")){
                if (!q.isEmpty()){
                    if (q.poll() == 1){
                        sum += val ;
                    }
                    else{
                        sum -=val ;
                    }

                }
                else {
                    sum = val;
                }
                q.offer(0); // 0 --> '-'
                val = 0 ;
                ans = "" ;
            }
        }
        if (!q.isEmpty() && q.poll() == 1){
            sum += val ;
        }
        else{
            sum -= val ;
        }

       return sum;
    }

    public static void main(String[] args) {
        String str = "zerominustwo"; // input string
        int ans = getAns(str) ;
        System.out.println(ans);
    }
}
