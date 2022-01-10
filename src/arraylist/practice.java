package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        String [] countries = {"japan","korea","United States","Turkey","United Kingdom","Canada"};

        //converting array to ArrayList
      ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length()>=10);

        System.out.println("list = " + list);


        //converting arrayList to array
       countries= list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));







    }
}
