package com.questions.trees;

/**
 * Created by matthewgoo on 2/5/17.
 */
public class Power {
    public static void main(String[] args) {
        Power p = new Power();
//        int x = p.pow(71045970, 41535484, 64735492);
//        int x = p.pow(0, 0, 1);
//        int x = p.pow(-1, 1, 20);
        int x = p.pow(8, 8, 11);
        System.out.println(x);
    }

    public int pow(int x, int y, int z) {

        int ans = 1;
        int square = x;
        if (y == 0)
            return 1;
        while (y != 0) {
            if (y % 2 == 1) {
                ans = ans * square;
            }
            square = (square * square) % z;
            y = y / 2;
            if (ans > z) {
                ans = ans % z;
            }
        }
        return ans;
    }
//    public int pow(int x, int n, int d) {
//        if(x == 0) {
//            return 0;
//        }
//        int ans = getPower(x, n, d);
//        if(ans < 0) {
//            return d + ans;
//        }
//        return ans;
//    }
//
//    static int getPower(int x, int n, int d) {
//        if(n == 0) {
//            return 1;
//        }
//        if(n == 1) {
//            return x;
//        }
//        int temp = getPower(x, (n/2), d);
//        temp = temp%d;
//        if(n%2 == 0) {
//            return temp*temp;
//        } else {
//            return (temp*temp*(x%d));
//        }
//    }
}
