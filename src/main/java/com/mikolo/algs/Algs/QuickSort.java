package com.mikolo.algs.Algs;

import com.mikolo.algs.Interfaces.IQuickSort;
import com.mikolo.algs.Interfaces.IQuickSort;

public class QuickSort implements IQuickSort {
    @Override
    public int[] sort(int tab[], int low, int high) {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(tab, low, high);

            sort(tab, low, pi-1);
            sort(tab, pi+1, high);
        }
        return tab;
    }

    @Override
    public int partition(int[] tab, int low, int high) {
        int pivot = tab[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (tab[j] <= pivot){
                i++;
            swap(tab, i, j);
                // swap arr[i] and arr[j]
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        swap(tab, i+1, high);

        return i+1;
    }

    @Override
    public void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
