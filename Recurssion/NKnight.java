package com.company.Recurssion;

public class NKnight {
    public static void main(String[] args) {
  boolean[][] arr = new boolean[3][3];

      //  nKnight(arr , 0, 0 ,4);
      //  System.out.println(count);
    }
    static int count = 0 ;
   static void nKnight(boolean[][] board , int row , int col  , int target ){

       if ( target == 0) {
           display(board);
           System.out.println();
           count++ ;
           return ;
       }
       if (row == board.length-1  && col==board.length) return  ;
       if (col == board.length){
           nKnight(board , row+1 , 0 , target);
           return  ;
       }
       if (isSafe(board ,  row ,  col)){
           board[row][col] = true;
           nKnight(board , row , col+1 , target-1);
           board[row][col] = false;
       }

       nKnight(board , row , col+1 , target);

   }
   static boolean isSafe(boolean[][] board , int r , int c){
      if (isValid(board , r-2 , c+1)){
          if (board[r-2][c+1])return false;
      }
       if (isValid(board , r-2 , c-1)){
           if (board[r-2][c-1])return false;
       }
       if (isValid(board , r -1, c+2)){
           if (board[r-1][c+2])return false;
       }
       if (isValid(board , r -1, c-2)){
           if (board[r-1][c-2])return false;
       }
      return true;
   }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row>=0 && row<=board.length-1 && col >= 0 && col <= board[0].length-1) return true;
        return false;
    }

    static void display(boolean[][] board){
        for (boolean[] arr: board){
            for(boolean ele : arr){
                if (ele){
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
       }
   }
}
