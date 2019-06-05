package com.mikolo.algs.Interfaces;

public interface IBackPackProblem {
    void addItem(int weight, int value);
    void solve();
    int getMaxValue();
}
