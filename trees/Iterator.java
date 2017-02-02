package com.questions.trees;

/**
 * Created by matthewgoo on 1/31/17.
 */
public class Iterator {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode root;
    public TreeNode currentNode;

    public Iterator(TreeNode root) {
        this.root = root;
        this.currentNode = currentNode;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return this.currentNode.left != null || this.currentNode.right != null;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode left = this.currentNode.left;
        TreeNode right = this.currentNode.right;

        if(left.val < right.val) {
            this.currentNode = left;
            return left.val;
        } else {
            this.currentNode = right;
            return right.val;
        }
    }
}
