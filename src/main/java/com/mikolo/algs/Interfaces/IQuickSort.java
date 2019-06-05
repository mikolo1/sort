package com.mikolo.algs.Interfaces;

public interface IQuickSort {
    int[] sort(int tab[], int low, int high);
    int partition(int tab[], int low, int high);
    void swap(int[] tab, int i, int j);
}
