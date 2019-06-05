package com.mikolo.algs.Algs;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    BubbleSort bs = new BubbleSort();
    int[]tab=new int[]{4,3,9,6,7,5,8,2,1,6,15,11,10};
    int[]tab2=new int[]{4,3,9,6,7,5,8,2,1,6,15,11,10};

    @Before
    public void setup(){

        bs.sort(tab);
        Arrays.sort(tab2);
    }

    @Test
    public void sort() {

        assertArrayEquals(tab, tab2);
    }
}