package BacpackProblemSolution;

import lombok.ToString;

@ToString
public class Item {
    public String name;
    public int value;
    public int weight;

    public Item(String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

}
