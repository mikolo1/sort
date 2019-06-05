package BacpackProblemSolution;


public class BackpackTest {
    public static void main(String[] args) {


        // we take the same instance of the problem displayed in the image
        Item[] items = {
                new Item("Elt1", 4, 12),
                new Item("Elt2", 2, 1),
                new Item("Elt3", 2, 2),
                new Item("Elt4", 1, 1),
                new Item("Elt5", 10, 4),
                new Item("Elt6", 5, 1)};


        Backpack bp = new Backpack(items, 8);
        bp.display();

        Solution solution = bp.solve();
        solution.display();
    }
}
