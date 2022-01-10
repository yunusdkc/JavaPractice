package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_task {
    public static void main(String[] args) {

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.charAt(0) == 'M');
        System.out.println(list);

        names = list.toArray(new String[0]); // I dont get it
        System.out.println(Arrays.toString(names));


    }
}
