package customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class pizzaOrdering {
    public static void main(String[] args) {
        ArrayList<pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            pizza small = new pizza('S', 2, 3);
            pizza medium = new pizza('M', 3, 4);
            pizza large = new pizza('L', 4, 5);
            pizzas.addAll(Arrays.asList(small, medium, large));

        }
        System.out.println("total number of pizza " + pizzas.size());
        double totalPrice = 0;

        for (pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();

        }
        System.out.println("totalPrice = " + totalPrice);


    }
}
