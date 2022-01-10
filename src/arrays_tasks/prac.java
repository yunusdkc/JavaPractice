package arrays_tasks;

import java.util.Arrays;

public class prac {
    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};


        String[][] ytd = new String[3][];

        ytd[0] = group1;
        ytd[1] = group2;
        ytd[2] = group3;

       // System.out.println(Arrays.toString(ytd)); THIS IS  for one dimensional arrays only

        System.out.println(Arrays.deepToString(ytd));



    }
}
