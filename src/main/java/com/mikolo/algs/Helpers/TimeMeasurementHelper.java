package com.mikolo.algs.Helpers;

import com.mikolo.algs.Interfaces.IAlgorithmRunner;

import static com.mikolo.algs.Statics.Constants.EXECUTION_NUMBER;

public class TimeMeasurementHelper {
    public static float ExecutionTimeMeasure(IAlgorithmRunner testAlgorithm, Boolean useConsolePrint) {
        if (useConsolePrint) System.out.println("Time measurement started ");
        long startTime = System.nanoTime();
        testAlgorithm.setup();
        for (int i = 0; i < EXECUTION_NUMBER; i++) {
            testAlgorithm.run();
        }
        float elapsedTime = System.nanoTime() - startTime;
        if (useConsolePrint) System.out.printf("Algorithm took :\n %f secons", elapsedTime / Math.pow(10, 9));
        return elapsedTime;
    }

    /**
     * This method is used to compare two different algorithms
     * Displays(in seconds) positive time dif if B was faster
     *
     * @param algorithmRunnerA algorithm A runner
     * @param algorithmRunnerB algorithm B runner
     */
    public static void Compare(IAlgorithmRunner algorithmRunnerA, IAlgorithmRunner algorithmRunnerB) {
        float aTime = ExecutionTimeMeasure(algorithmRunnerA, false);
        float bTime = ExecutionTimeMeasure(algorithmRunnerB, false);
        System.out.println("\n\n\n");
        System.out.println("Time diff generated succesfully ");
        System.out.println("*********************************");
        System.out.printf("Time diff between A and B: %f seconds\n", (aTime - bTime) / Math.pow(10, 9));
        System.out.println("*********************************");
        System.out.println("\n\n\n");

    }
}
