package com.company.BinaryTree;

import java.util.*;

public class topview {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        topview(root);
        System.out.println();
        bottomview(root);
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
    static void topview(Node root){
        ArrayDeque<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair curr = q.poll();
            if (!map.containsKey( curr.hd)){
                map.put(curr.hd , curr.node.val);
            }
            if (curr.node.left!=null){
                q.offer(new Pair(curr.hd -1 , curr.node.left));
            }
            if (curr.node.right!=null){
                q.offer(new Pair(curr.hd +1 , curr.node.right));
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }

    }
    static void bottomview(Node root){
        ArrayDeque<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair curr = q.poll();
                map.put(curr.hd , curr.node.val);
            if (curr.node.left!=null){
                q.offer(new Pair(curr.hd -1 , curr.node.left));
            }
            if (curr.node.right!=null){
                q.offer(new Pair(curr.hd +1 , curr.node.right));
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }

    }
}
class Pair{
    int hd;
    Node node ;

    public Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}
