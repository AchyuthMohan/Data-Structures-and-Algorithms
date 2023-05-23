import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void topView(Node root) {
        Node temp=root;
        HashSet<Integer>set=new HashSet<>();
        
        while(temp!=null){
            if(!set.contains(temp.data)){
                System.out.print(temp.data+" ");
                set.add(temp.data);
            }
            temp=temp.left;
        }
        temp=root;
        while(temp!=null){
            if(!set.contains(temp.data)){
                System.out.print(temp.data+" ");
                set.add(temp.data);
            }
            temp=temp.right;
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
