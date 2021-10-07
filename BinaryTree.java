

/*
Name : Aakash jain
WHOLE INDUSTRY LEVEL IMPLMENTATION OF BINARY TREE WITH SUM,MAX ELEMENT ,MIN ELEMENT AND HEIGHT
*/
java.util.*;
public class binaryTree{
    public static class Node{
       int data;
       Node left;
       Node right;
       Node(int data , Node left , Node right){
           this.data = data;
           this.left = left;
           this.right = right;
       }
       Node(int data){
           this(data,null,null);
       } 
    }

    public static void preOrder(Node root , ArrayList<Integer> ans){
        if(root == null)
            return;
        
            ans.add(root.data);
            preOrder(root.left, ans);
            preOrder(root.right, ans);

    }
    public static void inOrder(Node root , ArrayList<Integer> ans){
        if(root == null)
            return;
        
            preOrder(root.left, ans);
            ans.add(root.data);
            preOrder(root.right, ans);

    }
    public static void postOrder(Node root , ArrayList<Integer> ans){
        if(root == null)
            return;
        
            preOrder(root.left, ans);
            preOrder(root.right, ans);
            ans.add(root.data);

    }
    public static int size(Node node) {
        if(node == null)
            return 0;

        int left = size(node.left);
        int right = size(node.right);
        return left + right + 1;

    // return node == null ? 0 : size(node.left) + size(node.right) + 1;
    }
  
    public static int sum(Node node) {
        if(node == null)
        return 0;

        int left = sum(node.left);
        int right = sum(node.right);
        return left + right + node.data;

        // return node == null ? 0 : sum(node.left) + sum(node.right) + node.data;
    }
  
    public static int max(Node node) {
        if(node == null)
            return -(int)1e9;
        
        int left = max(node.left);
        int right = max(node.right);

        return Math.max(node.data , Math.max(left,right));

        // return node == null ? -(int)1e9 : Math.max(node.data,(Math.max(max(node.left),max(node.right))); 
    }
    
    public static int min(Node node) {
        if(node == null)
            return (int)1e9;
        
        int left = min(node.left);
        int right = min(node.right);

        return Math.min(node.data , Math.min(left,right));
        // return node == null ? (int)1e9 : Math.min(node.data,(Math.min(min(node.left),min(node.right)))
    }
//   height in terms of edges return -1 when node is null , height in terms of nodes return 0 when node is null
    public static int height(Node node) {
        if(node == null)
            return -1;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left , right) + 1;
        // return node == null ? -1 : Math.max(height(node.left),height(node.right)) + 1;
    }
