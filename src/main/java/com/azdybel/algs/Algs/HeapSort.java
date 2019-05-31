package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IHeapSort;

public class HeapSort implements IHeapSort {

    @Override
    public void sort(int[] tab) {
        buildHeap(tab);
        for (int i = tab.length - 1; i > 0; i--) {
            swap(tab, 0, i);
            findMaxHeap(tab, 0, i - 1);
        }
    }

    @Override
    /* Budujemy stertę */
    public void buildHeap(int[] tab) {
        for (int i = (tab.length - 1) / 2; i >= 0; i--)
            findMaxHeap(tab, i, tab.length - 1);
    }

    @Override
    /* Podmieniamy największy element w stercie */
    public void findMaxHeap(int[] tab, int i, int size) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= size && tab[left] > tab[i]) {
            max = left;
        }
        if (right <= size && tab[right] > tab[max]) {
            max = right;
        }
        if (max != i) {
            swap(tab, i, max);
            findMaxHeap(tab, max, size);
        }
    }

    @Override
    /* Zamiana elementów w tablicy */
    public void swap(int[] tab, int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }
}
