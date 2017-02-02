package com.questions.trees;

/**
 * Created by matthewgoo on 1/30/17.
 */
public class Sqrt {
    public static void main(String[] args) {
        Sqrt s = new Sqrt();
        int a = s.sqrt(450488554);
        System.out.println(a);
    }
    public int sqrt(int a) {
        int start = 1;
        int end = a;
        int ans = 0;
        if(a == 0 || a == 1) {
            return a;
        } else if(a == 2) {
            return 1;
        }

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            Double product = (double)mid * mid;

            if(product == a) {
                return mid;
            } else if(product > a) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }
}
