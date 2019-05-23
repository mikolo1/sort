package com.azdybel.algs.Interfaces;

public interface IInsertionSort<T> {

    int getSortedSize();
    T getElementIndex(int index);
    void insertElement(int index, T elementToInsert);
    void showTableElements();
    void sort();
    public boolean binarySearch(int[]tab, int numberToFind);
}
