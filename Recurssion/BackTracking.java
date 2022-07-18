package com.company.Recurssion;

public class BackTracking {
    public static void main(String[] args) {
        int[][] board = new int[5][5];

        if (Nqueens(board, 0)){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + "  ");
                }
                System.out.println();
            }
    }
    }
    static boolean Nqueens(int[][] board , int row){
        if (row == board.length){
            return true;
        }
        for (int col = 0; col <board.length ; col++) {
            if (isSafe(board , row,col)){
                board[row][col] = 1 ;
               if(  Nqueens(board , row+1))
                   return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int oldRow = row;
        int OldCOl = col;
      // for Left diagonal
        while (col>=0 && row>=0){
            if (board[row][col]==1){
                return false;
            }
        row--;
        col--;
        }
        row = oldRow;
        col = OldCOl;
//        for right diagonal
        while (col<board.length && row >=0){
            if (board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        row = oldRow;
        col = OldCOl;
        while (row>=0){
            if (board[row][col]==1)
            {
            return false;}
            row--;
        }
        return true;
    }
}
