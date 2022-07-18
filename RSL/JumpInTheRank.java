package com.company.RSL;

import java.util.Arrays;

public class JumpInTheRank
{
    public static void main(String[] args) {
        String[] names = {"sam", "ram", "geek" , "sonu"} ;
        int[] marks= {80, 79, 75,60} ;
        int[] updates = {0, 5, -9,39} ;

        getJump(names , marks , updates) ;
    }

    private static void getJump(String[] names, int[] marks, int[] updates) {
        int[] oldMarks = new int[marks.length] ;
        for (int i = 0; i < oldMarks.length; i++) {
            oldMarks[i] = marks[i] ;
        }
        for (int i = 0; i <marks.length ; i++) {
            marks[i] = marks[i] + updates[i] ;
        }
        int currRank = getMaxIndex(marks);
        int prevRank = getPreviousRank(oldMarks , currRank) ;  //3
        int jump = prevRank - 1  ;

        System.out.println("Name : " + names[currRank] + " and he jumped " + jump );
    }

    private static int getPreviousRank(int[] oldMarks, int currRank) {
        int prevRank = 0 ;
        int prev_ele = oldMarks[currRank];
        for (int i = 0; i <oldMarks.length ; i++) {
            if (oldMarks[i] == prev_ele) {
                prevRank = i ;
                break;
            }
        }
        return prevRank+1;
    }

    private static int getMaxIndex(int[] marks) {
        int max = 0 ;
        for(int i = 0 ; i< marks.length ; i++ ){
            if (marks[i] > marks[max]) max = i ;
        }
        return max;
    }
}
