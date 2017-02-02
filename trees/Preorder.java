package com.questions.trees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by matthewgoo on 2/1/17.
 */

public class Preorder {
    public static void main(String[] args) {
        Preorder p = new Preorder();
        TreeNode x10 = new TreeNode(10);
        TreeNode x14 = new TreeNode(14);
        TreeNode x16 = new TreeNode(16);
        TreeNode x15 = new TreeNode(15);
        TreeNode x5 = new TreeNode(5);
        TreeNode x4 = new TreeNode(4);
        x10.left = x5;
        x10.right = x15;
        x15.left = x14;
        x15.right = x16;

        ArrayList<Integer> a = p.preorderTraversal(x10);
        System.out.println(a);
    }



    public ArrayList<Integer> preorderTraversal(TreeNode a) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode currentNode = a;
        boolean hasVisited = false;

        while(currentNode != null || !s.isEmpty()) {
            if(!hasVisited) {
                ans.add(currentNode.val);
            }

            if(currentNode.left != null && !hasVisited) {
                s.push(currentNode);
                currentNode = currentNode.left;
            } else if(currentNode.right != null) {
                hasVisited = false;
                currentNode = currentNode.right;
            } else {
                if(!s.isEmpty()) {
                    hasVisited = true;
                    currentNode = s.pop();
                } else {
                    currentNode = null;
                }
            }
        }
        return ans;
    }
}
