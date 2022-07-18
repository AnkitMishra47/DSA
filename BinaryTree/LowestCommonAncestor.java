package com.company.BinaryTree;


import java.util.ArrayList;
import java.util.Scanner;

public class LowestCommonAncestor {
    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

     Node root1 = createTree();
     size(root1 , 6);
     ArrayList<Integer> ans  = list;
     System.out.println(ans);


    }
    static Node createTree(){
        Node root = null;
        Node result =null;
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if (data!=-1){
            root = new Node(data);
            System.out.println("Enter the left for "+data);
            root.left = createTree();
            System.out.println("Enter the right for "+data);
            root.right = createTree();

            result = root;
        }
        return result;
    }
    static int height(Node root){
        if (root == null){
            return 0 ;
        }
        return Math.max(height(root.left) , height(root.right)) + 1 ;
    }
    static void size(Node root , int val){
        if (root == null) return ;
        list.add(root.val);
        if (root.val == val)
            return ;
        size(root.left, val);
        size(root.right, val);
    }
}
