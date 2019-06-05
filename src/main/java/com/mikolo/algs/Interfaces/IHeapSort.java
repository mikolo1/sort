package com.mikolo.algs.Interfaces;

public interface IHeapSort {

    void sort(int[]tab);
    void buildHeap(int[]tab);
    void findMaxHeap(int [] tab, int i, int size);
    void swap(int []tab, int i, int j);

}
