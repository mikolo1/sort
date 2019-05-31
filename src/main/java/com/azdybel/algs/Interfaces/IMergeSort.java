package com.azdybel.algs.Interfaces;

public interface IMergeSort {


    void sort(int[]tab);
    void mergeSort(int[]tab, int leftIndex, int rightIndex);
    void merge(int []tab, int leftIndex, int middleIndex,  int rightIndex);
}
