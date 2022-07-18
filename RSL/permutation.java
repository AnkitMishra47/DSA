package com.company.RSL;

public class permutation {
    public static void main(String[] args) {
   permute("","123");
    }
   //       "" / abc  --> "a"/bc  ;

    static void permute(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }

        char ch = up.charAt(0) ;

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i) ;
            String second = p.substring(i , p.length());
            permute(first + ch  +second , up.substring(1)); //
        }
    }
}
