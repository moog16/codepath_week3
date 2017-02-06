package com.questions.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by matthewgoo on 2/5/17.
 */
public class MatrixSearch {
    public static void main(String[] args) {
        MatrixSearch m = new MatrixSearch();
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,   3,  5,  7));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(10, 11, 16, 20));
//        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(23, 30, 34, 50));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 5, 6, 6, 6, 7));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 10, 10, 12, 12, 13, 14, 21, 21));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(23, 26, 26, 29, 29, 31, 32, 35, 37));
        ArrayList<Integer> d = new ArrayList<>(Arrays.asList(38, 39, 39, 39, 41, 41, 42, 42, 43));
        ArrayList<Integer> e = new ArrayList<>(Arrays.asList(45, 45, 46, 46, 46, 47, 48, 48, 51));
        ArrayList<Integer> f = new ArrayList<>(Arrays.asList(51, 51, 54, 54, 54, 54, 56, 58, 59));
        ArrayList<Integer> g = new ArrayList<>(Arrays.asList(60, 61, 61, 62, 63, 64, 65, 66, 67));
        ArrayList<Integer> h = new ArrayList<>(Arrays.asList(67, 67, 70, 70, 71, 73, 73, 73, 74));
        ArrayList<Integer> i = new ArrayList<>(Arrays.asList(74, 79, 79, 80, 82, 84, 84, 84, 87));
        ArrayList<Integer> j = new ArrayList<>(Arrays.asList(89, 93, 94, 94, 97, 98, 98, 98, 98));
        ArrayList<ArrayList<Integer>> x = new ArrayList<>(Arrays.asList(a, b, c,d,e,f,g,h,i,j));
        int y = m.searchMatrix(x, 64);
        System.out.println(y);
    }
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        ArrayList<Integer> containingRow = getRow(a, b, 0, a.size() - 1);
        if(containingRow == null) {
            return 0;
        }
        boolean ans = hasInt(containingRow, b, 0, containingRow.size() - 1);

        return ans ? 1 : 0;
    }

    ArrayList<Integer> getRow(ArrayList<ArrayList<Integer>> a, int b, int startIndex, int endIndex) {
        int midIndex = endIndex + ((startIndex - endIndex) / 2);
        ArrayList<Integer> midRow = a.get(midIndex);

        if(midRow.get(0) <= b && midRow.get(midRow.size() - 1) >= b) {
            return midRow;
        }
        if(startIndex >= endIndex) {
            return null;
        }
        ArrayList<Integer> startRow = a.get(startIndex);
        ArrayList<Integer> endRow = a.get(endIndex);
        if(startRow.get(0) <= b && midRow.get(0) > b) {
            return getRow(a, b, startIndex, midIndex - 1);
        }
        return getRow(a, b, midIndex + 1, endIndex);
    }

    boolean hasInt(ArrayList<Integer> a, int b, int startIndex, int endIndex) {
        int midIndex = endIndex + ((startIndex - endIndex) / 2);
        int midNum = a.get(midIndex);

        if(midNum == b) {
            return true;
        }
        if(startIndex >= endIndex || startIndex < 0 || endIndex >= a.size()) {
            return false;
        }
        if(a.get(startIndex) <= b && midNum > b) {
            return hasInt(a, b, startIndex, midIndex - 1);
        }
        return hasInt(a, b, midIndex + 1, endIndex);
    }


}
