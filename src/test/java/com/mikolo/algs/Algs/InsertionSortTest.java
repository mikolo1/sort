package com.mikolo.algs.Algs;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void binarySearch() {
        int[]tab=new int[]{1,3,4,6,8,9,10,12,15,19,22,29};
        InsertionSort is = new InsertionSort();
        assertTrue(is.binarySearch(tab, 9));

    }
}