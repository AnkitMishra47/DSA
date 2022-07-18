package com.company.Recurssion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        /*  mazeWithObstacles("" , 3 ,3 ,2 ,2 );*/


       /* boolean[][] maze = new boolean[3][3];
        for (int i = 0; i <maze.length ; i++) {
            Arrays.fill(maze[i] , true);
        }

        allPath("" , maze , 0 , 0 );*/
        System.out.println(mazeWithObstacles(5,5,3,1));
    }

    static ArrayList<String> list = new ArrayList<>();

    static void maze(String up, int r, int c) {
        if (r == 1 && c == 1) {
            list.add(up);
            System.out.println(up);
        }
/*
            diagonal
           if (r>1&&c>1)
            maze(up+"d" , r-1,c-1);*/
        if (r > 1)
            maze(up + "D", r - 1, c);
        if (c > 1)
            maze(up + "R", r, c - 1);
    }

    static int  mazeWithObstacles( int r, int c, int or, int oc) {
        if (r == 1 && c == 1) {
          return 1 ;
        }

        int count = 0 ;
        if (r == or+1 && c == oc+1) return 0 ;
        if (r > 1)
            count+= mazeWithObstacles( r - 1, c, or, oc);
        if (c > 1)
           count+=  mazeWithObstacles( r, c - 1, or, oc);

        return count;
    }

    static void allPath(String up, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(up);
            return;
        }
        if (!maze[r][c]) {

            return;
        }
        maze[r][c] = false;
        if (r > 0) {
            allPath(up + "U", maze, r - 1, c);
        }
        if (c > 0) {
            allPath(up + "L", maze, r, c - 1);
        }
        if (r < maze.length - 1) {
            allPath(up + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(up + "R", maze, r, c + 1);
        }
        // backtracking
        maze[r][c] = true;
    }

    static void allPathPrint(String up, int[][] maze, int r, int c, int count) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            maze[r][c] = ++count;
            printArr(maze);
            System.out.println(up);
            System.out.println();
            return;
        }
        if (maze[r][c] != 0) {
            return;
        }
        maze[r][c] = ++count;
        if (r > 0) {
            allPathPrint(up + "U", maze, r - 1, c, count);
        }
        if (c > 0) {
            allPathPrint(up + "L", maze, r, c - 1, count);
        }
        if (r < maze.length - 1) {
            allPathPrint(up + "D", maze, r + 1, c, count);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(up + "R", maze, r, c + 1, count);
        }
        // backtracking
        maze[r][c] = 0;

    }
    static void printArr(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}