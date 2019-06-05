package com.mikolo.algs.Algs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Item implements Comparable<Item> {
    private int weight;
    private int value;


    @Override
    public int compareTo(Item o) {
        double o1ratio = (double)this.value / (double)this.weight;
        double o2ratio = (double)o.value / (double)o.weight;
        if(o1ratio==o2ratio){
            if(this.weight>o.weight){
                return 1;
            }return -1;
        }
        return o1ratio <= o2ratio ? 1 : -1;
    }
}
