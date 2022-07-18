package com.company.Recurssion;

public class PermutationSpaces {


    public static void main(String[] args) {
        String str = "ABC";
        spaces(str,"");
    }
    static void spaces(String str , String p){
        if (str.length()==1){
            p+=str.charAt(0);
            System.out.println(p);
            return;
        }
        String ch = str.charAt(0)+"";
        char spaces = '_';
        spaces(str.substring(1) , p+ch+spaces);
        spaces(str.substring(1) , p+ch);
    }
}
