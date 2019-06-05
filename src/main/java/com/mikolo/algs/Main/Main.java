package com.mikolo.algs.Main;

import com.azdybel.algs.Algs.*;
import com.mikolo.algs.Helpers.NewtonClass;
import com.mikolo.algs.Helpers.TimeMeasurementHelper;
import com.mikolo.algs.Interfaces.IAlgorithmRunner;
import com.mikolo.algs.Helpers.NewtonClass;

import java.util.Arrays;
import java.util.Set;

import static com.mikolo.algs.Helpers.TimeMeasurementHelper.Compare;

public class Main {
    public static void main(String[] args) {

        NewtonClass n = new NewtonClass();
        n.printNewtonTriangle(14);


//        ListInsertionSort myListIn = new ListInsertionSort();
//        myListIn.setup();

//        InsertionSort is = new InsertionSort();
//        int[]tab=new int[]{1,3,4,6,8,9,10,12,15,19,22,29};
//
//        System.out.println(is.binarySearch(tab, 12));

//        MergeSort ms = new MergeSort();
//        int[]tab7=new int[]{18,13,10,2,8,17,14,15,12,4,3,9,6,1,7,5};
//
//        System.out.println("Przed sortowaniem:");
//        System.out.println(Arrays.toString(tab7));
//        System.out.println("----------------------");
//        System.out.println("Po sortowaniu mergeSort:");
//        ms.sort(tab7);
//        System.out.println(Arrays.toString(tab7));

//        HeapSort hs = new HeapSort();
//
//        int[]tab6=new int[]{18,13,10,2,8,17,14,15,12,4,3,9,6,1,7,5};
//
//        System.out.println(Arrays.toString(tab6));
//
//        hs.sort(tab6);
//        System.out.println("----------------------");
//        System.out.println(Arrays.toString(tab6));

//        QuickSort qs = new QuickSort();
//        int[]tab4=new int[]{17,14,15,12,4,3,9,6,7,5};
//        System.out.println("Przed sortowaniem:");
//        for(int i = 0; i<tab4.length; i++){
//
//            System.out.println(tab4[i]);
//        }
//        System.out.println("---------------");
//        System.out.println("Po sortowaniu:");
//        int[]tab5 = qs.sort(tab4, 0, tab4.length-1);
//        for(int i = 0; i<tab5.length; i++){
//
//            System.out.println(tab5[i]);
//        }



//        BubbleSort bubbleSort = new BubbleSort();
//        int[]tab2=new int[]{4,3,9,6,7,5,8,2,1,6,15,11,10};
//        bubbleSort.sort(tab2);
//        for (int i = 0; i<tab2.length; i++){
//            System.out.println(tab2[i]);
//        }


//        System.out.println("---------------");
//        CountingSort cs = new CountingSort();
//        int[]tab3 = new int[]{12,12,4,5,5,4,2,1,2,4,5,6,2,7,8,5,4,4,3,7,7};
//        System.out.println("Przed sortowaniem");
//        System.out.println(Arrays.toString(tab3));
//        cs.sort(tab3, 12);
//        System.out.println("---------------");
//        System.out.println("po sortowaniu");
//        System.out.println(Arrays.toString(tab3));



//        TimeMeasurementHelper.ExecutionTimeMeasure(is,true);
//        TimeMeasurementHelper.ExecutionTimeMeasure(bubbleSort,true);



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
