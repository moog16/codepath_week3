package com.questions.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by matthewgoo on 2/5/17.
 */
public class RotatedArraySearch {
    public static void main(String[] args) {
        RotatedArraySearch s = new RotatedArraySearch();
//        List<Integer> a = new ArrayList<>(Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100));
//        List<Integer> a = new ArrayList<>(Arrays.asList(1, 7, 67, 133, 178 ));
//        List<Integer> a = new ArrayList<>(Arrays.asList(9, 10, 11, 12, 14, 15, 17, 19, 24, 25, 30, 39, 40, 44, 46, 48, 51, 53, 54, 56, 59, 60, 69, 70, 73, 75, 80, 87, 88, 89, 92, 93, 97, 99, 104, 107, 109, 110, 111, 117, 123, 124, 125, 126, 127, 128, 135, 136, 137, 141, 148, 153, 154, 161, 166, 167, 169, 175, 177, 180, 181, 182, 185, 186, 189, 193, 198, 202, 1, 2, 6, 7));
        List<Integer> a = new ArrayList<>(Arrays.asList(180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177));

        int b = s.search(a, 202);
        System.out.println(b);
    }

    public int search(final List<Integer> a, int b) {
        return indexOf(a, b, 0, a.size() -1);
    }

    static int indexOf(final List<Integer> a, int b, int startIndex, int endIndex) {
        int midIndex = endIndex + (startIndex - endIndex)/2;
        int mid = a.get(midIndex);

        if(mid == b) {
            return midIndex;
        }
        if( endIndex >= a.size() || startIndex < 0 || startIndex >= endIndex) {
            return -1;
        }
        int leftMid = a.get(midIndex-1);
        int start = a.get(startIndex);

        if(leftMid >= start && leftMid >= b && start <= b
                || leftMid <= start && leftMid >= b && start >= b) {
            return indexOf(a, b, startIndex, midIndex-1);
        }
        return indexOf(a, b, midIndex+1, endIndex);

    }
}
