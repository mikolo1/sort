package com.mikolo.algs.Algs;

import com.mikolo.algs.Interfaces.IAlgorithmRunner;
import com.mikolo.algs.Interfaces.IBackPackProblem;
import com.mikolo.algs.Statics.Constants;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BackPackProblem implements IBackPackProblem, IAlgorithmRunner{
    private List<Item> items = new ArrayList<>();
    //private int[]items = new int[Constants.MAX_NUMEER_OF_ITEMS];
    private int capacity;
    private int numberOfItems;
    private int maxValue;

    @Override
    public void addItem(int weight, int value) {
        items.add(new Item(weight, value));
    }

    @Override
    public void solve() {
        while(capacity>0 &&items.size()>0&&items.get(0).getWeight()<=capacity){
            Item i = items.get(0);
            capacity-=i.getWeight();
            maxValue+=i.getValue();
            items.remove(i);
        }
    }

    @Override
    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public void setup() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pojemność plecaka:");
        capacity = in.nextInt();
        System.out.println("Podaj nr elementu:");
        numberOfItems = in.nextInt();
        for(int i = 0; i<numberOfItems; i++);
        System.out.println("Podawaj wagę i wartość elementu:");
        addItem(in.nextInt(), in.nextInt());
    }

    @Override
    public void run() {

    }
}
