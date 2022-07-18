package com.company.RSL;

public class StringsRotation
{
    public static void main(String[] args) {
        String s1 = "ABACD" ;
        String s2 = "CDABA" ;
        String nstr = s1 + s1  ;
        boolean ans = false ;
        for (int i = 0; i <s1.length(); i++) {
            String subStr = nstr.substring(i , s1.length()+i) ;
            if (subStr.equals(s2)){
                ans = true ;
                break;
            }
        }
        System.out.println(ans);
    }
}
