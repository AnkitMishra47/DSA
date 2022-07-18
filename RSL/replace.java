package com.company.RSL;

public class replace {

    public static String FindIntersection(String[] strArr) {
        // code goes here

        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");

        int i = 0 ;
        int j = 0 ;

        String ans = "" ;

        while(i < arr1.length && j < arr2.length ){
            int left  =  Integer.parseInt(arr1[i]);
            int right = Integer.parseInt(arr2[j]);
            if( left > right ){
                j++;
            }
            else if(left < right ){
                i++;
            }
            else{
                ans  +=  arr1[i] + "," ;
            }
        }

        strArr[0] = ans.isEmpty() ? "false"  :  ans.substring(0 , ans.length()-1) ;
        return strArr[0];
    }



    public static void main (String[] args) {
        // keep this function call here
        String[] arr =  {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"} ;
        System.out.print(FindIntersection(arr));
    }

}