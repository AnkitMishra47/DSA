package com.company.Basic;

public class Triangular_Num {
    public static void main(String[] args) {
        int n = 55;
        int sum = 0 ;
        int ans =  -1;
        for (int i = 0; i <=n/3+1  ; i++) {
            sum+= i;
            if (n == sum){
                ans = 1;
                break;
            }
            else if (n <sum){
                break;
            }
        }
        System.out.println(ans);
    }
}
