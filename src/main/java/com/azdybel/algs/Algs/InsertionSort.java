package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IInsertionSort;

import java.util.Random;

public class InsertionSort implements IInsertionSort<Integer>, IAlgorithmRunner {

    private int[] table;
    private int sortedSize;
    private int[] sortedTable;
    private int filledTableSize;

    @Override
    public int getSortedSize() {
        return sortedSize;
    }

    @Override
    public Integer getElementIndex(int index) {
        return table[index];
    }

    @Override
    public void insertElement(int index, Integer elementToInsert) {
        setFilledTableSize(filledTableSize);

        if (index < 0 && index > table.length - 1) {
            System.out.println("w tablicy nie ma takiego indeksu");
        } else {
            int j = getFilledTableSize();
            for (; j > index; j--) {
                table[j] = table[j - 1];
            }
            table[j] = elementToInsert;
        }
    }

    @Override
    public void showTableElements() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }

    @Override
    public void sort() {
        int tabValue;
        int j;

        for (int i = 1; i < table.length; i++) {
            j = i;
            tabValue = table[i];
            while (j > 0 && table[j - 1] > tabValue) {
                table[j] = table[j - 1];
                j--;
            }
            table[j] = tabValue;
        }

    }

    @Override
    public boolean binarySearch(int[] tab, int numberToFind) {
        int l = 0;                             //zakres do lewej
        int r = tab.length-1;                         //zakres do prawej
        int m;                                      //środek tabeli

        while (l <= r) {
            m = (l + r) / 2;
            if (tab[m] == numberToFind) {
                return true;
            } else if (numberToFind > tab[m]) {
                l = m + 1;
            } else if (numberToFind < tab[m]) {
                r = m - 1;
            }
        }

        return false;
    }

    @Override
    public void setup() {
        this.table = new int[300];

        for (int i = 0; i < 300; i++) {
            this.table[i] = new Random(System.nanoTime()).nextInt(300);
        }
        setFilledTableSize(10);

    }

    @Override
    public void run() {
        sort();
    }

    public int getFilledTableSize() {
        return filledTableSize;
    }

    public void setFilledTableSize(int filledTableSize) {
        this.filledTableSize = filledTableSize;
    }
}
