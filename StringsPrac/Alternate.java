package com.company.StringsPrac;

public class Alternate {
    public static void main(String[] args) {
        String s = "Ankit is a Ankit Akhil";

        System.out.println(replaceall(s , "Akhil","Ankit"));
    }
    static String replaceall(String s , String old , String New ){
        String ans = "";

        for (int i = 0; i <s.length() ; i++) {
            int right = old.length() + i ;
            if (right > s.length()) right = s.length();
            String test = s.substring(i , right);
            if (test.equals(old) ){
                // Ankit is a good boy . Ankit --> Akhil
                ans += New;
                i = right;

            }
            if (i < s.length()) {
                char e = s.charAt(i);
                ans += e;
            }

        }
        
        return ans; 
        
    }
}
