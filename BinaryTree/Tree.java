package com.company.BinaryTree;

import java.util.Scanner;

public class Tree 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root  = createTree();
      /*
        inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postorder(root);
        */
       // System.out.println(height(root));
        // System.out.println(size(root));
        System.out.println(max(root));
    }
    public static Node createTree() {
        Node result = null;
        Node root = null;
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if (data != -1) {
            root = new Node(data);
            System.out.println("Enter the left for " + data);
            root.left = createTree();
            System.out.println("Enter the right for " + data);
            root.right = createTree();
            result = root;
        }
        return result;
    }
    static void inorder(Node root){
        if (root == null)return;

        inorder(root.left);
        System.out.print(root.val+ "->");
        inorder(root.right);
    }
    static void preOrder(Node root){
        if (root == null)return;

        System.out.print(root.val+ "->");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postorder(Node root){
        if (root == null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ "->");
    }
    static int height(Node root){
        if (root == null) return 0;

        return Math.max(height(root.left) , height(root.right)) + 1  ;
    }
    static int size(Node root){
        if (root == null) return 0 ;

        return size(root.left) + size(root.right)  + 1 ;
    }
    static int max(Node root){
        if (root == null){
            return -1;
        }
        int max = Math.max( max(root.right) ,max(root.left));

        return Math.max(max, root.val);


    }
}
