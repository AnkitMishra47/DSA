package com.company.Recurssion;

public class SudokuSolver {
    public static void main(String[] args) {
int[][] board =
               {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
if (isSolved(board)){
    display(board);
}
else {
    System.out.println("Sudoku can't be solved");
}
    }
    static boolean isSolved(int[][] board){

        int row = -1 ;
        int col = -1  ;
        boolean Emptyleft = false;
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if (board[i][j] == 0 ){
                    row = i ;
                    col = j ;
                    Emptyleft = true;
                    break;
                }
            }
            if (Emptyleft) break;
        }
        if (!Emptyleft) return true ;
    // backtrack
        for (int number = 1; number <= 9  ; number++) {
            if (isSafe(board , row , col , number)){
                board[row][col] = number;
                if (isSolved(board))return true;
                else board[row][col] = 0 ;
            }
        }
          return  false;
    }
    static boolean isSafe(int[][] board , int r , int c , int num){
        // for rows
        for (int i = 0; i < board.length ; i++) {
            if (board[i][c] == num) return false;
        }
        // for columns
        for (int i = 0; i < board.length ; i++) {
            if (board[r][i] == num) return false;
        }
        // for box
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = r - r%sqrt;
        int colStart = c - c%sqrt;

        for (int i = rowStart; i <rowStart + sqrt ; i++) {
            for (int j = colStart; j <colStart + sqrt ; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }
    static void display(int[][] board){
        for (int[] arr: board){
            for(int ele : arr){
                System.out.print(ele + "  ");
            }
            System.out.println();
        }
    }
}
