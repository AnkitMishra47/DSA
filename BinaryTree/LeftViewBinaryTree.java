package com.company.BinaryTree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LeftViewBinaryTree {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        int height = heightOfTree(root);
       // printlevelOrder(root , height);
        printleftview(root,height);
       // inorder(root);
    }
    static Node createTree(){
        Node result = null;
        System.out.println("Enter the data : ");
        int val = sc.nextInt();

        if (val !=-1){
            Node root = new Node(val);
            System.out.println("Enter the left node for "+root.val);
            root.left = createTree();
            System.out.println("Enter the right node for "+root.val);
            root.right = createTree();
            result = root;
        }
        return result;
    }
   /* static void inorder(Node root){
        if (root==null) return;

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }*/
    static void printlevelOrder(Node root,int height){
        if (root == null)return;
        for (int i  = 1 ; i <= height ; i++){
            printCurrLevel(root,i);
        }
    }
    static void printCurrLevel(Node root , int level){
        if (root == null)return;
        if (level==1) System.out.print(root.val+" ");
        if (level > 1){
            printCurrLevel(root.left ,level-1);
            printCurrLevel(root.right,level-1);
        }
    }
    static int heightOfTree(Node root){
        if (root == null) return 0 ;
        return Math.max(heightOfTree(root.left) , heightOfTree(root.right)) + 1;

    }
    static void printleftview(Node root,int height){
        int[] arr = new int[height];
        Arrays.fill(arr,-1);
        printleftviewutil(root , arr , 0 );
        for (int curr : arr){
            System.out.print(curr + " ");
        }
    }
    static void printleftviewutil(Node root , int[] arr , int level){
        if (root == null) return;
        if (arr[level] != -1){
            arr[level] = root.val;
        }
        printleftviewutil(root.left,arr ,level + 1);
        printleftviewutil(root.right,arr ,level + 1);
    }
}

