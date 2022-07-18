package com.company.Revision;

public class NestedBracket {
    public static void main(String[] args) {
        String str = new String("(a+(b*c)/((4)/8))+1");
        int nestedLength = 0 ;
        int count = 0 ;
        for (int i = 0; i <str.length(); i++) {
            char e = str.charAt(i);
            if (e == '('){
                count++;
            nestedLength = Math.max(count , nestedLength);
        }
            if (e==')'){
                count--;
            }
        }
        System.out.println(nestedLength);
    }
}
