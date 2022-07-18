package com.company.StringsPrac;

public class Reversewords {
    public static void main(String[] args) {
        String str = "Ankit    is   a    good     boy" ;
        str = reverse(str);
        System.out.println(str);
        int ans  = str.lastIndexOf("Ankit");
        System.out.println(ans);
    }
    static String reverse(String str){
        String ans = "";
        String helper ="";
        str = str +" ";
        int whitespacesIndex =  0 ;
        for (int i = 0; i <str.length() ; i++) {

            char e = str.charAt(i);
            if (e==' ')whitespacesIndex++;
            helper += e ;
            if (helper.length() == whitespacesIndex )
            {   helper= "";
                whitespacesIndex=0;
                continue;
            }
            if (e==' '){
                ans = helper + ans;
                helper ="";
                whitespacesIndex=0;
            }

        }
        return ans.substring(0 , ans.length()-1);
    }
}
