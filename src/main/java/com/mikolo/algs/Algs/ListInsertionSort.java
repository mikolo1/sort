package com.mikolo.algs.Algs;

import com.mikolo.algs.Interfaces.IAlgorithmRunner;
import com.mikolo.algs.Interfaces.IInsertionSort;
import com.mikolo.algs.Main.ListElement;
import com.mikolo.algs.Main.MyList;
import com.mikolo.algs.Interfaces.IAlgorithmRunner;
import com.mikolo.algs.Interfaces.IInsertionSort;
import com.mikolo.algs.Main.MyList;

import java.util.Random;

public class ListInsertionSort implements IInsertionSort<ListElement>, IAlgorithmRunner {

    private MyList myList;

    @Override
    public void setup() {
        this.myList = new MyList();
        ListElement twenty = new ListElement(20);
        for (int i = 0; i < 50; i++) {
            if (i != 20) {
                myList.add(new ListElement(i));
            } else {
                myList.add(twenty);
            }
        }
        myList.remove(twenty);
        ListElement iterator;
        iterator = myList.getHead();
        do {
            System.out.println(iterator.getValue());
            iterator = iterator.next;
        }
        while (iterator != myList.getHead());

    }

    @Override
    public void run() {

    }

    @Override
    public int getSortedSize() {
        return 0;
    }

    @Override
    public ListElement getElementIndex(int index) {
        return null;
    }

    @Override
    public void insertElement(int index, ListElement elementToInsert) {

    }

    @Override
    public void showTableElements() {

    }

    @Override
    public void sort() {

    }

    @Override
    public boolean binarySearch(int[] tab, int numberToFind) {
        return false;
    }
}
