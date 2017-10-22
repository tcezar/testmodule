package ru.tcezar.books.algorithms;

import ru.tcezar.books.algorithms.arrays.Rotation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nat on 22.10.17.
 */
public class Solutiom {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean checkBST(Node node, int min, int max) {
        if (node == null) return true;
        return  min < node.data && node.data < max &&
                checkBST(node.left, min, node.data) &&
                checkBST(node.right, node.data, max);
    }
    public static boolean  checkBST(Node root) {
        /*System.out.println("root="+root.data);
        System.out.println("left="+root.left!=null?root.left.data:"null");
        System.out.println("right="+root.right!=null?root.right.data:"null");*/
        if (root==null) {
            return true;
        }
        return root.left!=null?(root.left.data<root.data && checkBST(root.left)):true
                && root.right!=null?(root.right.data>root.data && checkBST(root.right)):true  ;


        //return checkBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
     */
    static public void testBST(){
        Node node = new Node(4,
                new Node(2, new Node(1), new Node(3)),
                new Node(6, new Node(5), new Node(7))
        );
        System.out.println(checkBST(node));
        System.out.println(checkBST(node,Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static void main(String[] args) {


    }


    public void leftRotation(){
        Scanner in = new Scanner(System.in);;
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        System.out.println("n="+n+" k="+k);
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
//        for(int i = 0; i<k; i++){
//            int tmp = a[0];
//            for(int j = 0;j<a.length-1;j++){
//                a[j] = a[j+1];
//            }
//            a[a.length-1] = tmp;
//        }
//
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Rotation.leftRotation(a,n)));
    }
}
