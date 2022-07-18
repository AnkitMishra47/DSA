package com.company.BinaryTree;
import javax.naming.spi.DirObjectFactory;
import java.util.*;
public class LevelOrder {
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
         Node root = createTree();
         int height = height(root);
         for (int i = 1 ; i  <= height ;  i++){
             printCurrLevel(root , i);
         }
         LevelOrder(root);
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
    public static void printCurrLevel(Node root , int level) {
        if (root == null){
            return ;
        }
        if (level == 1){
            System.out.print(root.val + " " );
        }
        else if (level > 1){
            printCurrLevel(root.left , level -1);
            printCurrLevel(root.right , level -1);
        }
    }
    static int height(Node root){
        if (root == null){
            return 0 ;
        }
        return Math.max(height(root.left) , height(root.right)) + 1 ;
    }
    static void LevelOrder(Node root){
        ArrayDeque<Node> q = new ArrayDeque<>();
        int i = 0 ;
        q.offer(root);
        while (!q.isEmpty()){
          Node temp = q.poll();
          if (temp.left!=null){
              q.offer(temp.left);
          }
          if (temp.right!=null){
              q.offer(temp.right);
          }
            System.out.print(temp.val + " ");

        }
    }
}
