package com.mikolo.algs.Algs;

import com.mikolo.algs.Interfaces.IAlgorithmRunner;
import com.mikolo.algs.Interfaces.IBubbleSort;
import com.mikolo.algs.Interfaces.IAlgorithmRunner;

import java.util.Random;

public class BubbleSort implements IBubbleSort, IAlgorithmRunner {

    int[]tab = new int[300];

    @Override
    public void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

//    public void swapIfIIsBigger(int[] tab, int i, int j) {
//
//        if(tab[i]>tab[j]) {
//            int temp = tab[i];
//            tab[i] = tab[j];
//            tab[j] = temp;
//        }
//    }

    @Override
    public boolean compare(int a, int b) {
        return a>b;
    }

    @Override
    public void sort(int[]tab) {
        for(int i = 1; i < tab.length; i++) {
            for(int j = 0; j < tab.length - i; j++) {
                if(compare(tab[j], tab[j + 1])) {
                    swap(tab, j, j + 1);
                }
            }
        }
    }

//    public void sort2(int[]tab) {
//        for(int i = 1; i < tab.length; i++) {
//            for(int j = 0; j < tab.length - i; j++) {
//               swapIfIIsBigger(tab, j, j + 1);
//            }
//        }
//    }

    @Override
    public void setup() {


        for (int i = 0; i < 300; i++) {
            tab[i] = new Random(System.nanoTime()).nextInt(300);
        }

    }

    @Override
    public void run() {
        sort(tab);
    }
}
