package com.company.RSL;

import java.util.Arrays;

public class Nways
{
    public static void main(String[] args) {
        boolean[][] vis = new boolean[3][3];
        int[][] arr = new int[3][3];
        nWays("" , 0 , 0 ,arr,1 );
    }

    static void nWays(String path , int r , int c , int[][] maze, int count ){
      if (r==2 && c==2 ){
          maze[r][c] = count ;
          System.out.println(path);
          printPath(maze) ;
          System.out.println();
          return ;
      }
      if (maze[r][c] != 0 ) return;
        maze[r][c] = count ;
      if (c < 2 ){
          nWays(path + 'R' , r , c+1, maze , count + 1 );
      }
      if (r < 2){
          nWays(path+'D' , r+1 , c, maze , count + 1);
      }
      if (r > 0){
          nWays(path+'U' , r-1 , c, maze , count + 1);
      }
      if (c > 0 ){
          nWays(path+'L' , r, c-1, maze , count + 1);
      }
        maze[r][c] = 0 ;

    }

    private static void printPath(int[][] maze) {
        for (int [] board : maze) {
            for (int e : board) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
