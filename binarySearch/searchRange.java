package com.questions.binarySearch;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by matthewgoo on 1/31/17.
 */
public class searchRange {
    public static void main(String[] args) {
        searchRange s = new searchRange();
        List<Integer> l = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10);
        ArrayList<Integer> a = s.searchRange(l , 1);
        System.out.println(a);
    }

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        List<Integer> ans = new ArrayList<>();

        if(a.size() == 1 && a.get(0) == b) {
            ans.add(0);
            ans.add(0);
            return (ArrayList<Integer>) ans;
        }

        return findIndex(a, b);
    }

    private ArrayList<Integer> findIndex(List<Integer> a, int b) {
        int end = a.size() - 1;
        int start = 0;
        List<Integer> ans = new ArrayList<>();

        int mid;

        while(start <= end) {
            if(a.get(start) == b && a.get(end) == b) {
                ans.add(start);
                ans.add(end);
                return (ArrayList<Integer>) ans;
            }
            mid = start + ( (end - start) / 2 );

            int num = a.get(mid);
            if(num == b) {
                if(a.get(end) == b) {
                    start++;
                } else {
                    end--;
                }
            } else if(num > b) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        ans.add(-1);
        ans.add(-1);
        return (ArrayList<Integer>) ans;

    }
}
