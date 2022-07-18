package com.company.Recurssion;

public class Nqueen {
    public static void main(String[] args) {
        int n = 4 ;
     boolean[][] board = new boolean[n][n];
        System.out.println(queen(board , 0));
    }
    static int queen(boolean[][] board , int row) {
        if (row == board.length){
            // Print board
            for(boolean[] arr : board ){
                for (boolean ele : arr){
                    if (ele){
                        System.out.print("Q ");
                    }
                    else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return 1 ;
        }
        int count = 0 ;
        for (int col = 0; col < board[0].length  ; col++) {
            if (isSafe(board , row , col )){
                board[row][col] = true;
                count += queen(board , row+1 );
                board[row][col] = false;
            }
        }

        return count;
    }
    static boolean isSafe(boolean[][] board  , int r , int c){
        // for up
        for (int i = 0 ; i < r  ; i++) {
            if (board[i][c]) return false;
        }
       //  for left
        int left = Math.min(r,c);
        for (int i = 1 ; i <=left ; i++) {
            if (board[r - i][c- i]) return false;
        }
       // for right
        int right = Math.min(r,board.length - 1 - c);
        for (int i = 1 ; i <=right ; i++) {
            if (board[r - i][c + i]) return false;
        }


      return  true;
    }
}
