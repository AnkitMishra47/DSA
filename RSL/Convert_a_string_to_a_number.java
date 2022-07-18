package com.company.RSL;

public class Convert_a_string_to_a_number {
    public static void main(String[] args) {
        String str = "+123";
        System.out.println(convert(str));
    }
    static int convert(String s){
        int n = s.length()  ;
        int ans = 0 ;
        for (int i = 0; i < n; i++) {
            int e = (int)s.charAt(i) ;
            if ( e < 48 || e> 57 ) continue; // marking a range
            // subtract 48  -  57
            ans = ans*10 + ((int)s.charAt(i) -48);
        }
        return ans;
    }
}
