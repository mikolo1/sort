package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.SimpleAlgorithm;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.Compare;

public class Main {
    public static void main(String[] args) {
        IAlgorithmRunner testAlgorithm = new SimpleAlgorithm();
        IAlgorithmRunner testAlgorithm2 = new SimpleAlgorithm();

        Compare(testAlgorithm, testAlgorithm2);
    }

}
