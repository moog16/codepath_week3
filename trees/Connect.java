package com.questions.trees;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by matthewgoo on 2/5/17.
 */

class TreeLinkNode {
 int val;
 TreeLinkNode left, right, next;
 TreeLinkNode(int x) { val = x; }
}


public class Connect {
    public static void main(String[] args) {
        Connect c = new Connect();
        TreeLinkNode x1 = new TreeLinkNode(1);
        TreeLinkNode x2 = new TreeLinkNode(2);
        TreeLinkNode x3 = new TreeLinkNode(3);
        x1.left = x2;

        c.connect(x1);
    }

    public void connect(TreeLinkNode root) {
        ArrayList<TreeLinkNode> level = new ArrayList<>();
        level.add(root);
        while(level.size() > 0) {
            setLevelNextToRight(level);
            level = populateNextLevel(level);
        }
    }

    static void setLevelNextToRight(ArrayList level) {
        for(int i=0; i<level.size(); i++) {
            TreeLinkNode current = (TreeLinkNode) level.get(i);
            if(i == level.size()-1) {
                current.next = null;
                break;
            }

            TreeLinkNode rightNeighbor = (TreeLinkNode) level.get(i+1);
            current.next = rightNeighbor;
        }
    }

    static ArrayList populateNextLevel(ArrayList level) {
        ArrayList<TreeLinkNode> a = new ArrayList<>(level.size()*2);
        for(int i=0; i<level.size(); i++) {
            TreeLinkNode child = (TreeLinkNode) level.get(i);
            if(child.left != null) {
                a.add(child.left);
            }
            if(child.right != null) {
                a.add(child.right);
            }
        }
        return a;
    }
}

//A : [ 40342, 40766, 41307, 42639, 42777, 46079, 47038, 47923, 48064, 48083, 49760, 49871, 51000, 51035, 53186, 53499, 53895, 59118, 60467, 60498, 60764, 65158, 65838, 65885, 65919, 66638, 66807, 66989, 67114, 68119, 68146, 68584, 69494, 70914, 72312, 72432, 74536, 77038, 77720, 78590, 78769, 78894, 80169, 81717, 81760, 82124, 82583, 82620, 82877, 83131, 84932, 85050, 85358, 89896, 90991, 91348, 91376, 92786, 93626, 93688, 94972, 95064, 96240, 96308, 96755, 97197, 97243, 98049, 98407, 98998, 99785, 350, 2563, 3075, 3161, 3519, 4176, 4371, 5885, 6054, 6495, 7218, 7734, 9235, 11899, 13070, 14002, 16258, 16309, 16461, 17338, 19141, 19526, 21256, 21507, 21945, 22753, 25029, 25524, 27311, 27609, 28217, 30854, 32721, 33184, 34190, 35040, 35753, 36144, 37342 ]

