package com.company.RSL;

public class numberPad {
    public static void main(String[] args) {
           // pad("" , "123");
        diceRoll("" , 5);
    }
    static void pad(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        int digit = up.charAt(0) - '0'  ;
        for (int i = (digit-1)*3; i <(digit)*3 ; i++) {
            char ch = (char)('a'+i) ;
            pad(p + ch , up.substring(1));
        }
    }
    static void diceRoll(String p , int up ){
        if (up == 0 ){
            System.out.print(p+" ");
            return;
        }
        if (up < 0){
            return;
        }

        for (int i = 1; i <=6 ; i++) {
            char ch = (char)('0' + i) ;
            diceRoll(p+ch,up-i);
        }

    }

}
