package com.company.BinaryTree;

import java.util.Scanner;

public class Diameter
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println(diameter(root));
        diameterOfTree(root);
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
    static int heightOfTree(Node root){
        if (root == null) return 0 ;
        return Math.max(heightOfTree(root.left) , heightOfTree(root.right)) + 1;

    }
    static int diameter(Node root){
        if (root == null) return 0 ;
        int dl = diameter(root.left);
        int dr = diameter(root.right);
        int curr = heightOfTree(root.left) + heightOfTree(root.right) + 1 ;

        return Math.max(curr , Math.max(dr,dl));
    }
    // Modification in height function for diameter ..
    static int ans = 0 ;
    static int diameterOfTree(Node root){
        if (root == null) return 0 ;
        int lh = diameterOfTree(root.left);
        int rh = diameterOfTree(root.right);
        ans = Math.max(ans , lh+rh+1);
        return 1 + Math.max(lh,rh);
    }


}
