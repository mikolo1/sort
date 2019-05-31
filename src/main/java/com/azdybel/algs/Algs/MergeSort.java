package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IMergeSort;

public class MergeSort implements IMergeSort {

    private static int[]tempTab;

    @Override
    public void sort(int[] tab) {
        if(tab == null || tab.length == 0){
            return;
        }
        tempTab = new int[tab.length];
        mergeSort(tab, 0, tab.length-1);

    }

    @Override
    public void mergeSort(int[] tab, int leftIndex, int rightIndex) {
        if(leftIndex<rightIndex){
            int middle = (leftIndex+rightIndex)/2;
            mergeSort(tab, leftIndex, middle);
            mergeSort(tab, middle+1, rightIndex);
            merge(tab, leftIndex, middle, rightIndex);
        }
    }

    @Override
    public void merge(int[] tab, int leftIndex, int middleIndex, int rightIndex) {
        for(int i = leftIndex; i<=rightIndex; i++) {
            tempTab[i] = tab[i];
        }

        int finger1= leftIndex;
        int finger2 = middleIndex+1;
        int current = leftIndex;        //indeks, w który wpisujemy najmniejszy element tablicy wynikowej
        while (finger1<=middleIndex&&finger2<=rightIndex){
            if(tempTab[finger1]<=tempTab[finger2]){
                tab[current] = tempTab[finger1];
                finger1++;
            }else {
                tab[current] = tempTab[finger2];
                finger2++;
            }
            current++;
        }
        while (finger1<=middleIndex){
            tab[current]=tempTab[finger1];
            current++;
            finger1++;
        }
        while (finger2<=rightIndex){
            tab[current]=tempTab[finger2];
            current++;
            finger2++;
        }

    }
}
