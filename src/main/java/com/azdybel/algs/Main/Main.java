package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Algs.ListInsertionSort;
import com.azdybel.algs.Algs.SimpleAlgorithm;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.Compare;

public class Main {
    public static void main(String[] args) {

        ListInsertionSort myListIn = new ListInsertionSort();
        myListIn.setup();

//        IAlgorithmRunner testAlgorithm = new SimpleAlgorithm();
//        IAlgorithmRunner testAlgorithm2 = new SimpleAlgorithm();
//
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.setup();
//
//        insertionSort.showTableElements();
//        System.out.println("-------------");
//        insertionSort.insertElement(3,3);
//        insertionSort.showTableElements();
//        System.out.println("-------------");
//        insertionSort.sort();
//        insertionSort.showTableElements();
//
//        Compare(testAlgorithm, testAlgorithm2);
    }

}
