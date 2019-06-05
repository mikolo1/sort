package com.mikolo.algs.Algs;

import com.mikolo.algs.Interfaces.ICountingSort;

public class CountingSort implements ICountingSort {

    private int[] count;

    @Override
    public int[] sort(int[] input, int k) {

        //k - maksymalna wartość występujca w zbiorze
        int counter[] = new int[k + 1]; //tablica pomocnicza

        for (int i : input) {           //wypełnienie tablicy pomocniczej
            counter[i]+=1;
        }

        int ndx = 0;                    //sortowanie
        for (int i = 0; i < counter.length; i++) {
            while (counter[i]>0) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
        return input;
    }
}



//        int[] ctr = new int[max - min + 1];
//        for (int number : tab) {
//            ctr[number - min]++;
//        }
//        int z = 0;
//        for (int i = min; i <= max; i++) {
//            while (ctr[i - min] > 0) {
//                tab[z] = 1;
//                z++;
//                ctr[1 - min]--;
//            }
//        }

