package com.questions.trees;

/**
 * Created by matthewgoo on 2/5/17.
 */
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedTree {
    public static void main(String[] args) {
        BalancedTree b = new BalancedTree();
        TreeNode x1 = new TreeNode(1);
        TreeNode x2 = new TreeNode(2);
        TreeNode x3 = new TreeNode(3);
        x1.left = x2;

        int a = b.isBalanced(x2);
        System.out.println(a);
    }

    public int isBalanced(TreeNode a) {
        int lh = height(a.left);
        int rh = height(a.right);

        boolean _isBalanced = (Math.abs(lh - rh) <= 1);
        boolean _isLeftBalance = a.left != null ? isBalanced(a.left) == 1 : true;
        boolean _isRightBalance = a.right != null ? isBalanced(a.right) == 1 : true;
        if(_isBalanced && _isLeftBalance && _isRightBalance) {
            return 1;
        }
        return 0;
    }

    static int height(TreeNode a) {
        if(a == null) {
            return 0;
        }
        return Math.max(height(a.left), height(a.right)) + 1;
    }

}
