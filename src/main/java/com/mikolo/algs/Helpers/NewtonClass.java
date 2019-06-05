package com.mikolo.algs.Helpers;

import com.mikolo.algs.Statics.Constants;

import com.mikolo.algs.Interfaces.INewtonsSymbol;

public class NewtonClass implements INewtonsSymbol {

    long[] factorialValues = new long[Constants.MAX_FACTORIAL_VALUE_INDEX];

    @Override
    public long factorial(long i) {
        if (factorialValues[(int) i] > 0) {
            return factorialValues[(int) i];
        }
        if (i < 1) {
            return 1;
        }
        factorialValues[(int) i] = factorial(i - 1) * i;
        return factorialValues[(int) i];
    }

    @Override
    public long nPoK(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return nPoK(n - 1, k) + nPoK(n - 1, k - 1);
        //return factorial(n)/factorial(k)*factorial(n-k);
    }

    @Override
    public void printNewtonTriangle(int rows) {
        int m = 2 * rows - 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < ((m - (2 * i - 1)) / 2); j++) {
                System.out.print("    ");
            }
            for (int k = 0; k <= i; k++) {
                if (k==0)System.out.print(nPoK(i, k)+" ");
                else System.out.printf("%8d", nPoK(i, k));
            }
            System.out.println();
        }
    }


}
