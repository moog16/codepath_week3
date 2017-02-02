package com.questions.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by matthewgoo on 2/1/17.
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MinDepth {

    private int shortest = -1;

    public static void main(String[] args) {
        MinDepth m = new MinDepth();
        TreeNode x10 = new TreeNode(10);
        TreeNode x14 = new TreeNode(14);
        TreeNode x16 = new TreeNode(16);
        TreeNode x15 = new TreeNode(15);
        TreeNode x5 = new TreeNode(5);
        TreeNode x4 = new TreeNode(4);
//        x10.left = x5;
//        x10.right = x15;
//        x15.left = x14;
//        x15.right = x16;

        int a = m.minDepth(x10);
        System.out.println(a);
    }

    public int minDepth(TreeNode a) {
        shortest = -1;
        getSmallestDepth(a, 1);
        return shortest;
    }

    private void getSmallestDepth(TreeNode a, int depth) {
        if(a.left == null && a.right == null) {
            if(shortest <= 0) {
                shortest = depth;
            } else {
                if(shortest > depth) {
                    shortest = depth;
                }
            }
            return;
        }
        if(a.left != null) {
            getSmallestDepth(a.left, depth + 1);
        }
        if(a.right != null) {
            getSmallestDepth(a.right, depth + 1);
        }

    }
}


